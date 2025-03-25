package com.ghpham11a.xp_grpc_client.controllers;

import build.buf.protovalidate.ValidationResult;
import build.buf.protovalidate.Validator;
import build.buf.protovalidate.exceptions.ValidationException;
import com.ghpham11a.xp_grpc_client.dtos.CreateCaseDto;
import com.ghpham11a.xp_grpc_client.services.CaseService;
import com.ghpham11a.xp_grpc_client.utils.CreateCaseDtoConverter;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ghpham11a.cases.*;

@RestController
public class CasesController {

    private final CaseService caseService;

    @Autowired
    public CasesController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/open-cases/{identifier}")
    public ResponseEntity<String> getOpenCase(@PathVariable String identifier) {
        try {
            OpenCase response = caseService.findOpenCase(identifier);
            // Convert protobuf message to JSON string.
            String json = JsonFormat.printer().print(response);
            return ResponseEntity.ok(json);
        } catch (InvalidProtocolBufferException e) {
            // Handle exception as needed
            return ResponseEntity.status(500).body("Error serializing message [OPEN]: " + e.getMessage());
        }
    }

    @GetMapping("/closed-cases/{identifier}")
    public ResponseEntity<String> getClosedCase(@PathVariable String identifier) {
        try {
            ClosedCase response = caseService.findClosedCase(identifier);
            // Convert protobuf message to JSON string.
            String json = JsonFormat.printer().print(response);
            return ResponseEntity.ok(json);
        } catch (InvalidProtocolBufferException e) {
            // Handle exception as needed
            return ResponseEntity.status(500).body("Error serializing message [CLOSED]: " + e.getMessage());
        }
    }

    @PostMapping("/cases")
    public ResponseEntity<String> createCase(@RequestBody CreateCaseDto request) {
        CreateCase createCaseRequest = CreateCaseDtoConverter.toProto(request);

        Validator validator = new Validator();

        ValidationResult validationResult = ValidationResult.EMPTY;

        String caseCode = "[NULL]";

        try {
            if (createCaseRequest.hasOpenCase()) {
                caseCode = "[OPEN]";
                validationResult = validator.validate(createCaseRequest.getOpenCase());
            }
            if (createCaseRequest.hasClosedCase()) {
                caseCode = "[CLOSED]";
                validationResult = validator.validate(createCaseRequest.getClosedCase());
            }
        } catch (ValidationException e) {
            return ResponseEntity.status(500).body("Error validating message " + caseCode + ": " + e.getMessage());
        }

        if (validationResult.isSuccess()) {
            try {

                if (createCaseRequest.hasOpenCase()) {
                    OpenCase result = caseService.createOpenCase(createCaseRequest.getOpenCase());
                    String json = JsonFormat.printer().print(result);
                    return ResponseEntity.ok(json);
                }
                if (createCaseRequest.hasClosedCase()) {
                    ClosedCase result = caseService.createClosedCase(createCaseRequest.getClosedCase());
                    String json = JsonFormat.printer().print(result);
                    return ResponseEntity.ok(json);
                }
            } catch (InvalidProtocolBufferException e) {
                // Handle exception as needed
                return ResponseEntity.status(500).body("Error serializing message " + caseCode + ": " + e.getMessage());
            }
        }
        return ResponseEntity.status(500).body("We hit a snag " + caseCode + "...");
    }
}
