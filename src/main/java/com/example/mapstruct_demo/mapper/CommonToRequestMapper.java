package com.example.mapstruct_demo.mapper;

import com.example.mapstruct_demo.common.model.entity.ApplicantEntity;
import com.example.mapstruct_demo.common.model.entity.ApplicationEntity;
import com.example.mapstruct_demo.common.model.entity.LoanInfoEntity;
import com.example.mapstruct_demo.config.MapStructConfig;
import com.example.mapstruct_demo.dto.Applicant;
import com.example.mapstruct_demo.dto.Application;
import com.example.mapstruct_demo.dto.LoanInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

@Mapper(config = MapStructConfig.class)
public interface CommonToRequestMapper {

    @Mapping(source = "entity.applicationId", target = "applicationId", qualifiedByName = "isBlankThenSkip")
    @Mapping(source = "entity.duplicateCode", target = "duplicateCode", qualifiedByName = "isBlankThenSkip")
    Application overlayApplication(ApplicationEntity entity, @MappingTarget Application target);

    @Mapping(source = "entity.loanPurpose", target = "loanPurpose", qualifiedByName = "isBlankThenSkip")
    @Mapping(source = "entity.requestedLoanAmount", target = "requestedLoanAmount", qualifiedByName = "isBlankThenSkip")
    LoanInfo overlayLoanInfo(LoanInfoEntity entity, @MappingTarget LoanInfo target);

    @Mapping(source = "entity.firstName", target = "firstName", qualifiedByName = "isBlankThenSkip")
    @Mapping(source = "entity.lastName", target = "lastName", qualifiedByName = "isBlankThenSkip")
    Applicant overlayApplicant(ApplicantEntity entity, @MappingTarget Applicant target);

    @Named("isBlankThenSkip")
    static boolean isBlankThenSkip(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
