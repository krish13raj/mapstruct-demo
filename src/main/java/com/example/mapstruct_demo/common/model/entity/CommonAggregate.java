package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class CommonAggregate {
    // Top-level metadata
    private String timestamp;       // e.g. "2025-05-01T16:22:44.630Z"
    private String bomVersionId;    // e.g. "2.1"

    // Application section
    private ApplicationEntity application;

    // Loan info section
    private LoanInfoEntity loanInfo;

    // Applicants section
    private List<ApplicantEntity> applicants;

    // Credit decisioning section
    private CreditDecisioningEntity creditDecisioning;

    // FICO configurations section
    private FicoConfigurationsEntity ficoConfigurations;


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBomVersionId() {
        return bomVersionId;
    }

    public void setBomVersionId(String bomVersionId) {
        this.bomVersionId = bomVersionId;
    }

    public ApplicationEntity getApplication() {
        return application;
    }

    public void setApplication(ApplicationEntity application) {
        this.application = application;
    }

    public LoanInfoEntity getLoanInfo() {
        return loanInfo;
    }

    public void setLoanInfo(LoanInfoEntity loanInfo) {
        this.loanInfo = loanInfo;
    }

    public List<ApplicantEntity> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<ApplicantEntity> applicants) {
        this.applicants = applicants;
    }

    public CreditDecisioningEntity getCreditDecisioning() {
        return creditDecisioning;
    }

    public void setCreditDecisioning(CreditDecisioningEntity creditDecisioning) {
        this.creditDecisioning = creditDecisioning;
    }

    public FicoConfigurationsEntity getFicoConfigurations() {
        return ficoConfigurations;
    }

    public void setFicoConfigurations(FicoConfigurationsEntity ficoConfigurations) {
        this.ficoConfigurations = ficoConfigurations;
    }
}
