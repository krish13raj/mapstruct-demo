package com.example.mapstruct_demo.mapper;

import com.example.mapstruct_demo.common.model.entity.CommonAggregate;
import com.example.mapstruct_demo.dto.*;
import com.example.mapstruct_demo.fico.model.FicoAggregate;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Map;

@Mapper(componentModel = "spring", uses = {CommonToRequestMapper.class})
public interface TransactionMapper {

    @Mapping(source = "fico.timestamp", target = "timeStamp")
    @Mapping(source = "fico.bomVersionId", target = "bomVersionId")
    @Mapping(source = "fico.application", target = "application")
    @Mapping(source = "fico.loanInfo", target = "application.loanInfo")
    @Mapping(source = "fico.applicants", target = "applicants")
    @Mapping(source = "fico.creditDecisioning", target = "creditDecisioning")
    @Mapping(source = "fico.ficoConfigurations", target = "ficoConfigurations")
    TransactionInput buildTransactionInput(FicoAggregate fico, CommonAggregate common, Map<String, Object> defaults);

    /**
     * Overlay common values after FICO mapping.
     */
    @AfterMapping
    default void overlayCommon(CommonAggregate common, @MappingTarget TransactionInput ti) {
        if (common == null) return;

        // Overlay Application
        if (common.getApplication() != null) {
            Application app = ti.getApplication();
            if (app == null) {
                app = new Application();
                ti.setApplication(app);
            }
            if (common.getApplication().getApplicationId() != null) {
                app.setApplicationId(common.getApplication().getApplicationId());
            }
            if (common.getApplication().getDuplicateCode() != null) {
                app.setDuplicateCode(common.getApplication().getDuplicateCode());
            }
        }

        // Overlay LoanInfo
        if (common.getLoanInfo() != null) {
            LoanInfo loan = ti.getApplication().getLoanInfo();
            if (loan == null) {
                loan = new LoanInfo();
                ti.getApplication().setLoanInfo(loan);
            }
            if (common.getLoanInfo().getLoanPurpose() != null) {
                loan.setLoanPurpose(common.getLoanInfo().getLoanPurpose());
            }
            if (common.getLoanInfo().getRequestedLoanAmount() != null) {
                loan.setRequestedLoanAmount(common.getLoanInfo().getRequestedLoanAmount());
            }
        }

        // Overlay Applicants
        if (common.getApplicants() != null && !common.getApplicants().isEmpty()) {
            List<Applicant> applicants = ti.getApplicants();
            if (applicants == null || applicants.isEmpty()) {
                // Replace if FICO gave none
                // (You can also merge field-by-field if needed)
                // Here we just map common applicants directly
                // Assuming you have a CommonToRequestMapper for ApplicantEntity → Applicant
            }
        }

        // Overlay CreditDecisioning
        if (common.getCreditDecisioning() != null) {
            CreditDecisioning cd = ti.getCreditDecisioning();
            if (cd == null) {
                cd = new CreditDecisioning();
                ti.setCreditDecisioning(cd);
            }
            // overlay fields as needed
        }

        // Overlay FicoConfigurations
        if (common.getFicoConfigurations() != null) {
            FicoConfigurations fc = ti.getFicoConfigurations();
            if (fc == null) {
                fc = new FicoConfigurations();
                ti.setFicoConfigurations(fc);
            }
            if (common.getFicoConfigurations().getDmFlow() != null) {
                fc.setDmFlow(common.getFicoConfigurations().getDmFlow());
            }
        }
    }

    /**
     * Apply defaults for missing/null values.
     */
    @AfterMapping
    default void applyDefaults(@MappingTarget TransactionInput ti) {
        if (ti.getApplication() == null) {
            ti.setApplication(new Application());
        }
        if (ti.getApplication().getDuplicateCode() == null) {
            ti.getApplication().setDuplicateCode("N");
        }
        if (ti.getApplication().getChannelType() == null) {
            ti.getApplication().setChannelType("WEB");
        }
        if (ti.getApplication().getAccountOwnershipType() == null) {
            ti.getApplication().setAccountOwnershipType("I");
        }

        if (ti.getApplication().getLoanInfo() == null) {
            LoanInfo loan = new LoanInfo();
            loan.setDiscount(0.0);
            ti.getApplication().setLoanInfo(loan);
        }

        if (ti.getApplicants() == null || ti.getApplicants().isEmpty()) {
            Applicant a = new Applicant();
            a.setApplicantId("1");
            a.setApplicantType("Primary");
            a.setFirstName("UNKNOWN");
            a.setLastName("UNKNOWN");
            ti.setApplicants(List.of(a));
        }

        if (ti.getCreditDecisioning() == null) {
            ti.setCreditDecisioning(new CreditDecisioning());
        }

        if (ti.getFicoConfigurations() == null) {
            FicoConfigurations fc = new FicoConfigurations();
            fc.setDmFlow("pre-pricing");
            ti.setFicoConfigurations(fc);
        }

        if (ti.getUnderwriterControls() == null) {
            ti.setUnderwriterControls(Map.of());
        }
    }
}