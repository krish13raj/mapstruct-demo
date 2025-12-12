package com.example.mapstruct_demo.mapper;

import com.example.mapstruct_demo.config.MapStructConfig;
import com.example.mapstruct_demo.dto.Applicant;
import com.example.mapstruct_demo.dto.Application;
import com.example.mapstruct_demo.dto.FieldPair;
import com.example.mapstruct_demo.dto.LoanInfo;
import com.example.mapstruct_demo.fico.model.FicoApplicantSource;
import com.example.mapstruct_demo.fico.model.FicoApplicationSource;
import com.example.mapstruct_demo.fico.model.FicoFieldPairSource;
import com.example.mapstruct_demo.fico.model.FicoLoanInfoSource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = MapStructConfig.class)
public interface FicoToRequestMapper {

    // Example: merge FICO application with defaults
    @Mapping(source = "fico.applicationId", target = "applicationId", defaultValue = "UNKNOWN_APP")
    @Mapping(source = "fico.decisionPath", target = "applicationDecisionPath", defaultValue = "DECISION_HCP")
    @Mapping(source = "fico.productCode", target = "productCode", defaultValue = "PL")
    @Mapping(source = "fico.subProductCode", target = "subProductCode", defaultValue = "PIL")
    @Mapping(source = "fico.channelType", target = "channelType", defaultValue = "WEB")
    @Mapping(source = "fico.duplicateCode", target = "duplicateCode", defaultValue = "N")
    @Mapping(source = "fico.webAuthenticatedFlag", target = "webAuthenticatedFlag", defaultValue = "false")
    @Mapping(source = "fico.applicationCreatedTimestamp", target = "applicationCreatedTimestamp", defaultValue = "2000-01-01")
    @Mapping(source = "fico.accountOwnershipType", target = "accountOwnershipType", defaultValue = "I")
    Application mapFicoApplication(FicoApplicationSource fico);

    @Mapping(source = "fico.loanPurpose", target = "loanPurpose", defaultValue = "")
    @Mapping(source = "fico.requestedLoanAmount", target = "requestedLoanAmount", defaultValue = "0")
    @Mapping(source = "fico.requestedTerm", target = "requestedTerm", defaultValue = "0")
    @Mapping(source = "fico.loanType", target = "loanType", defaultValue = "New")
    @Mapping(source = "fico.discount", target = "discount", defaultExpression = "java(0.0)")
    LoanInfo mapFicoLoanInfo(FicoLoanInfoSource fico);

    // Example applicant merge
    @Mapping(source = "fico.applicantId", target = "applicantId", defaultValue = "")
    @Mapping(source = "fico.applicantType", target = "applicantType", defaultValue = "Primary")
    @Mapping(source = "fico.firstName", target = "firstName", defaultValue = "UNKNOWN")
    @Mapping(source = "fico.lastName", target = "lastName", defaultValue = "UNKNOWN")
    @Mapping(source = "fico.birthDate", target = "birthDate", defaultValue = "")
    @Mapping(source = "fico.identificationType", target = "identificationType", defaultValue = "")
    @Mapping(source = "fico.identificationValue", target = "identificationValue", defaultValue = "")
    Applicant mapFicoApplicant(FicoApplicantSource fico);

    // Map arrays of attributes into FieldPair
    @Mapping(source = "name", target = "fieldName", defaultValue = "")
    @Mapping(source = "value", target = "fieldValue", defaultValue = "")
    FieldPair mapFicoFieldPair(FicoFieldPairSource src);

    List<FieldPair> mapFicoFieldPairs(List<FicoFieldPairSource> src);
}
