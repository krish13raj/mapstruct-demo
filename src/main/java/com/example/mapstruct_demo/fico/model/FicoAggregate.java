package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class FicoAggregate {

    // Top-level metadata
    private String timestamp;
    private String bomVersionId;

    // Application section
    private FicoApplicationSource application;

    // Loan info section
    private FicoLoanInfoSource loanInfo;

    // Applicants section
    private List<FicoApplicantSource> applicants;

    // Credit decisioning section
    private FicoCreditDecisioningSource creditDecisioning;

    // FICO configurations section
    private FicoConfigurationsSource ficoConfigurations;

    // --- Getters and Setters ---
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

    public FicoApplicationSource getApplication() {
        return application;
    }
    public void setApplication(FicoApplicationSource application) {
        this.application = application;
    }

    public FicoLoanInfoSource getLoanInfo() {
        return loanInfo;
    }
    public void setLoanInfo(FicoLoanInfoSource loanInfo) {
        this.loanInfo = loanInfo;
    }

    public List<FicoApplicantSource> getApplicants() {
        return applicants;
    }
    public void setApplicants(List<FicoApplicantSource> applicants) {
        this.applicants = applicants;
    }

    public FicoCreditDecisioningSource getCreditDecisioning() {
        return creditDecisioning;
    }
    public void setCreditDecisioning(FicoCreditDecisioningSource creditDecisioning) {
        this.creditDecisioning = creditDecisioning;
    }

    public FicoConfigurationsSource getFicoConfigurations() {
        return ficoConfigurations;
    }
    public void setFicoConfigurations(FicoConfigurationsSource ficoConfigurations) {
        this.ficoConfigurations = ficoConfigurations;
    }
}
