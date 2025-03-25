package com.ghpham11a.xp_grpc_client.dtos;

import java.util.List;

public class CreateCaseDto {

    // Only one of these should be non-null.
    private OpenCaseDto openCase;
    private ClosedCaseDto closedCase;

    public OpenCaseDto getOpenCase() {
        return openCase;
    }

    public void setOpenCase(OpenCaseDto openCase) {
        this.openCase = openCase;
    }

    public ClosedCaseDto getClosedCase() {
        return closedCase;
    }

    public void setClosedCase(ClosedCaseDto closedCase) {
        this.closedCase = closedCase;
    }

    public static class OpenCaseDto {

        private String identifier;
        private CaseCode caseCode;
        private List<OpenQueryDto> queries;

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

        public CaseCode getCaseCode() {
            return caseCode;
        }

        public void setCaseCode(CaseCode caseCode) {
            this.caseCode = caseCode;
        }

        public List<OpenQueryDto> getQueries() {
            return queries;
        }

        public void setQueries(List<OpenQueryDto> queries) {
            this.queries = queries;
        }
    }

    public static class OpenQueryDto {
        private int questionId;
        private int answerId;
        private String answerValue;

        public int getQuestionId() {
            return questionId;
        }

        public void setQuestionId(int questionId) {
            this.questionId = questionId;
        }

        public int getAnswerId() {
            return answerId;
        }

        public void setAnswerId(int answerId) {
            this.answerId = answerId;
        }

        public String getAnswerValue() {
            return answerValue;
        }

        public void setAnswerValue(String answerValue) {
            this.answerValue = answerValue;
        }
    }

    public static class ClosedCaseDto {
        private String identifier;

        private CaseCode caseCode;
        private Query1Dto query1;

        private Query2Dto query2;

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

        public CaseCode getCaseCode() {
            return caseCode;
        }

        public void setCaseCode(CaseCode caseCode) {
            this.caseCode = caseCode;
        }

        public Query1Dto getQuery1() {
            return query1;
        }

        public void setQuery1(Query1Dto query1) {
            this.query1 = query1;
        }

        public Query2Dto getQuery2() {
            return query2;
        }

        public void setQuery2(Query2Dto query2) {
            this.query2 = query2;
        }
    }

    public static class Query1Dto {
        private int questionId;
        private int answerId;
        private String answerValue;

        public int getQuestionId() {
            return questionId;
        }

        public void setQuestionId(int questionId) {
            this.questionId = questionId;
        }

        public int getAnswerId() {
            return answerId;
        }

        public void setAnswerId(int answerId) {
            this.answerId = answerId;
        }

        public String getAnswerValue() {
            return answerValue;
        }

        public void setAnswerValue(String answerValue) {
            this.answerValue = answerValue;
        }
    }

    public static class Query2Dto {

        private int questionId;
        private int answerId;
        private String answerValue;

        public int getQuestionId() {
            return questionId;
        }

        public void setQuestionId(int questionId) {
            this.questionId = questionId;
        }

        public int getAnswerId() {
            return answerId;
        }

        public void setAnswerId(int answerId) {
            this.answerId = answerId;
        }

        public String getAnswerValue() {
            return answerValue;
        }

        public void setAnswerValue(String answerValue) {
            this.answerValue = answerValue;
        }
    }

    public enum CaseCode {
        CODE_NULL(0),
        CODE_ONE(1),
        CODE_TWO(2),
        CODE_THREE(3),
        CODE_FOUR(4); // CODE_FOUR is added to support the allowed values for OpenCase

        private final int value;

        CaseCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static CaseCode fromValue(int value) {
            for (CaseCode code : values()) {
                if (code.getValue() == value) {
                    return code;
                }
            }
            throw new IllegalArgumentException("Invalid CaseCode value: " + value);
        }
    }
}

