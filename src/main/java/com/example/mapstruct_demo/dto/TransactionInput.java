package com.example.mapstruct_demo.dto;

import java.util.List;
import java.util.Map;

public class TransactionInput {
    private String timeStamp;
    private String bomVersionId;
    private Application application;
    private List<Applicant> applicants;
    private CreditDecisioning creditDecisioning;
    private FicoConfigurations ficoConfigurations;
    private Map<String, Object> underwriterControls;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getBomVersionId() {
        return bomVersionId;
    }

    public void setBomVersionId(String bomVersionId) {
        this.bomVersionId = bomVersionId;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public CreditDecisioning getCreditDecisioning() {
        return creditDecisioning;
    }

    public void setCreditDecisioning(CreditDecisioning creditDecisioning) {
        this.creditDecisioning = creditDecisioning;
    }

    public FicoConfigurations getFicoConfigurations() {
        return ficoConfigurations;
    }

    public void setFicoConfigurations(FicoConfigurations ficoConfigurations) {
        this.ficoConfigurations = ficoConfigurations;
    }

    public Map<String, Object> getUnderwriterControls() {
        return underwriterControls;
    }

    public void setUnderwriterControls(Map<String, Object> underwriterControls) {
        this.underwriterControls = underwriterControls;
    }
}
