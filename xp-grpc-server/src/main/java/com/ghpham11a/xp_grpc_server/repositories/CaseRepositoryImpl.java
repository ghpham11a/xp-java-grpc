package com.ghpham11a.xp_grpc_server.repositories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ghpham11a.cases.*;

import java.util.Optional;

@Repository
public class CaseRepositoryImpl implements CaseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public OpenCase createOpenCase(OpenCase openCase) {
        // Insert the OpenCase record
        String sqlOpenCase = "INSERT INTO open_case (identifier, case_code) VALUES (?, ?)";
        jdbcTemplate.update(sqlOpenCase, 
                openCase.getIdentifier(), 
                openCase.getCaseCode().getNumber());
        
        // Insert each associated OpenQuery record
        String sqlOpenQuery = "INSERT INTO open_query (open_case_identifier, question_id, answer_id, answer_value) VALUES (?, ?, ?, ?)";
        for (OpenQuery query : openCase.getQueriesList()) {
            jdbcTemplate.update(sqlOpenQuery, 
                    openCase.getIdentifier(), 
                    query.getQuestionId(), 
                    query.getAnswerId(), 
                    query.getAnswerValue());
        }
        return openCase;
    }

    @Override
    public ClosedCase createClosedCase(ClosedCase closedCase) {
        String sqlClosedCase = "INSERT INTO closed_case (identifier, case_code, query1_question_id, query1_answer_id, query1_answer_value, query2_question_id, query2_answer_id, query2_answer_value) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        // Retrieve Query1 and Query2 from the ClosedCase message
        Query1 query1 = closedCase.getQuery1();
        Query2 query2 = closedCase.getQuery2();
        
        jdbcTemplate.update(sqlClosedCase, 
                closedCase.getIdentifier(),
                closedCase.getCaseCode().getNumber(),
                query1.getQuestionId(),
                query1.getAnswerId(),
                query1.getAnswerValue(),
                query2.getQuestionId(),
                query2.getAnswerId(),
                query2.getAnswerValue());
        return closedCase;
    }

    @Override
    public Optional<OpenCase> getOpenCaseByIdentifier(String identifier) {
        String sql = "SELECT oc.identifier, oc.case_code, " +
                "oq.question_id, oq.answer_id, oq.answer_value " +
                "FROM open_case oc " +
                "LEFT JOIN open_query oq ON oc.identifier = oq.open_case_identifier " +
                "WHERE oc.identifier = ?";

        return jdbcTemplate.query(sql, new Object[]{identifier}, rs -> {
            OpenCase.Builder caseBuilder = null;
            while (rs.next()) {
                if (caseBuilder == null) {
                    caseBuilder = OpenCase.newBuilder()
                            .setIdentifier(rs.getString("identifier"))
                            .setCaseCode(CaseCode.forNumber(rs.getInt("case_code")));
                }
                // If question_id is null then there are no queries
                int questionId = rs.getInt("question_id");
                if (!rs.wasNull()) {
                    OpenQuery query = OpenQuery.newBuilder()
                            .setQuestionId(questionId)
                            .setAnswerId(rs.getInt("answer_id"))
                            .setAnswerValue(rs.getString("answer_value"))
                            .build();
                    caseBuilder.addQueries(query);
                }
            }
            return caseBuilder == null ? Optional.empty() : Optional.of(caseBuilder.build());
        });
    }

    @Override
    public Optional<ClosedCase> getClosedCaseByIdentifier(String identifier) {
        try {
            String sqlClosedCase = "SELECT * FROM closed_case WHERE identifier = ?";
            ClosedCase closedCase = jdbcTemplate.queryForObject(sqlClosedCase, new Object[]{identifier}, (rs, rowNum) -> {
                Query1 query1 = Query1.newBuilder()
                        .setQuestionId(rs.getInt("query1_question_id"))
                        .setAnswerId(rs.getInt("query1_answer_id"))
                        .setAnswerValue(rs.getString("query1_answer_value"))
                        .build();
                Query2 query2 = Query2.newBuilder()
                        .setQuestionId(rs.getInt("query2_question_id"))
                        .setAnswerId(rs.getInt("query2_answer_id"))
                        .setAnswerValue(rs.getString("query2_answer_value"))
                        .build();
                return ClosedCase.newBuilder()
                        .setIdentifier(rs.getString("identifier"))
                        .setCaseCode(CaseCode.forNumber(rs.getInt("case_code")))
                        .setQuery1(query1)
                        .setQuery2(query2)
                        .build();
            });
            return Optional.of(closedCase);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}

