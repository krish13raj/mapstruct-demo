package com.example.mapstruct_demo.dto;

import java.util.List;

public class Decisioning {

    private String policySubgroup;
    private String policyEffectiveDate;
    private List<ParameterBucket> parameters;
    private List<ServiceVersion> serviceVersions;
    private List<SubProductDecision> subProductDecisions;


    public String getPolicySubgroup() {
        return policySubgroup;
    }

    public void setPolicySubgroup(String policySubgroup) {
        this.policySubgroup = policySubgroup;
    }

    public String getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(String policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public List<ParameterBucket> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterBucket> parameters) {
        this.parameters = parameters;
    }

    public List<ServiceVersion> getServiceVersions() {
        return serviceVersions;
    }

    public void setServiceVersions(List<ServiceVersion> serviceVersions) {
        this.serviceVersions = serviceVersions;
    }

    public List<SubProductDecision> getSubProductDecisions() {
        return subProductDecisions;
    }

    public void setSubProductDecisions(List<SubProductDecision> subProductDecisions) {
        this.subProductDecisions = subProductDecisions;
    }
}
