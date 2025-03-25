package com.ghpham11a.xp_grpc_client.utils;

import com.ghpham11a.xp_grpc_client.dtos.CreateCaseDto;
import com.ghpham11a.cases.*;

public class CreateCaseDtoConverter {

    public static CreateCase toProto(CreateCaseDto dto) {
        CreateCase.Builder builder = CreateCase.newBuilder();
        if (dto.getOpenCase() != null) {
            builder.setOpenCase(toProto(dto.getOpenCase()));
        } else if (dto.getClosedCase() != null) {
            builder.setClosedCase(toProto(dto.getClosedCase()));
        }
        return builder.build();
    }

    private static OpenCase toProto(CreateCaseDto.OpenCaseDto dto) {
        OpenCase.Builder builder = OpenCase.newBuilder();
        builder.setIdentifier(dto.getIdentifier());
        builder.setCaseCode(convertCaseCode(dto.getCaseCode()));
        if (dto.getQueries() != null) {
            for (CreateCaseDto.OpenQueryDto queryDto : dto.getQueries()) {
                builder.addQueries(toProto(queryDto));
            }
        }
        return builder.build();
    }

    private static OpenQuery toProto(CreateCaseDto.OpenQueryDto dto) {
        return OpenQuery.newBuilder()
                .setQuestionId(dto.getQuestionId())
                .setAnswerId(dto.getAnswerId())
                .setAnswerValue(dto.getAnswerValue())
                .build();
    }

    private static ClosedCase toProto(CreateCaseDto.ClosedCaseDto dto) {
        ClosedCase.Builder builder = ClosedCase.newBuilder();
        builder.setIdentifier(dto.getIdentifier());
        builder.setCaseCode(convertCaseCode(dto.getCaseCode()));
        builder.setQuery1(toProto(dto.getQuery1()));
        builder.setQuery2(toProto(dto.getQuery2()));
        return builder.build();
    }

    private static Query1 toProto(CreateCaseDto.Query1Dto dto) {
        return Query1.newBuilder()
                .setQuestionId(dto.getQuestionId())
                .setAnswerId(dto.getAnswerId())
                .setAnswerValue(dto.getAnswerValue())
                .build();
    }

    private static Query2 toProto(CreateCaseDto.Query2Dto dto) {
        return Query2.newBuilder()
                .setQuestionId(dto.getQuestionId())
                .setAnswerId(dto.getAnswerId())
                .setAnswerValue(dto.getAnswerValue())
                .build();
    }

    /**
     * Converts the DTO's CaseCode enum to the Protobuf CaseCode.
     * Throws an exception if an unsupported value is encountered.
     */


    private static CaseCode convertCaseCode(CreateCaseDto.CaseCode dtoCaseCode) {
        switch (dtoCaseCode) {
            case CODE_NULL:
                return CaseCode.CODE_NULL;
            case CODE_ONE:
                return CaseCode.CODE_ONE;
            case CODE_TWO:
                return CaseCode.CODE_TWO;
            case CODE_THREE:
                return CaseCode.CODE_THREE;
            case CODE_FOUR:
                // CODE_FOUR is not defined in the Protobuf enum.
                throw new IllegalArgumentException("Invalid CaseCode for Protobuf: CODE_FOUR");
            default:
                throw new IllegalArgumentException("Unknown CaseCode: " + dtoCaseCode);
        }
    }
}

