package com.example.mapstruct_demo.common.model.entity;

public class ApplicationEntity {
    private String applicationId;
    private String applicationDecisionPath;
    private String productCode;
    private String subProductCode;
    private String channelType;
    private String duplicateCode;
    private Boolean webAuthenticatedFlag;
    private String applicationCreatedTimestamp;
    private String accountOwnershipType;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationDecisionPath() {
        return applicationDecisionPath;
    }

    public void setApplicationDecisionPath(String applicationDecisionPath) {
        this.applicationDecisionPath = applicationDecisionPath;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getDuplicateCode() {
        return duplicateCode;
    }

    public void setDuplicateCode(String duplicateCode) {
        this.duplicateCode = duplicateCode;
    }

    public Boolean getWebAuthenticatedFlag() {
        return webAuthenticatedFlag;
    }

    public void setWebAuthenticatedFlag(Boolean webAuthenticatedFlag) {
        this.webAuthenticatedFlag = webAuthenticatedFlag;
    }

    public String getApplicationCreatedTimestamp() {
        return applicationCreatedTimestamp;
    }

    public void setApplicationCreatedTimestamp(String applicationCreatedTimestamp) {
        this.applicationCreatedTimestamp = applicationCreatedTimestamp;
    }

    public String getAccountOwnershipType() {
        return accountOwnershipType;
    }

    public void setAccountOwnershipType(String accountOwnershipType) {
        this.accountOwnershipType = accountOwnershipType;
    }
}
