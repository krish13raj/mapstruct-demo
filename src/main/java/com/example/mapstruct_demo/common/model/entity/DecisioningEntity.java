package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class DecisioningEntity {
    private String policySubgroup;
    private String policyEffectiveDate;
    private List<ParameterBucketEntity> parameters;
    private List<ServiceVersionEntity> serviceVersions;
    private List<SubProductDecisionEntity> subProductDecisions;

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

    public List<ParameterBucketEntity> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterBucketEntity> parameters) {
        this.parameters = parameters;
    }

    public List<ServiceVersionEntity> getServiceVersions() {
        return serviceVersions;
    }

    public void setServiceVersions(List<ServiceVersionEntity> serviceVersions) {
        this.serviceVersions = serviceVersions;
    }

    public List<SubProductDecisionEntity> getSubProductDecisions() {
        return subProductDecisions;
    }

    public void setSubProductDecisions(List<SubProductDecisionEntity> subProductDecisions) {
        this.subProductDecisions = subProductDecisions;
    }
}
