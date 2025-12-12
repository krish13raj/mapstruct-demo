package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class DecisioningSource {
    private String policySubgroup;
    private String policyEffectiveDate;
    private List<ParameterBucketSource> parameters;
    private List<ServiceVersionSource> serviceVersions;
    private List<SubProductDecisionSource> subProductDecisions;

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

    public List<ParameterBucketSource> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterBucketSource> parameters) {
        this.parameters = parameters;
    }

    public List<ServiceVersionSource> getServiceVersions() {
        return serviceVersions;
    }

    public void setServiceVersions(List<ServiceVersionSource> serviceVersions) {
        this.serviceVersions = serviceVersions;
    }

    public List<SubProductDecisionSource> getSubProductDecisions() {
        return subProductDecisions;
    }

    public void setSubProductDecisions(List<SubProductDecisionSource> subProductDecisions) {
        this.subProductDecisions = subProductDecisions;
    }
}
