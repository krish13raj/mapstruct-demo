package com.example.mapstruct_demo.dto;

import java.util.List;

public class Application {
    private String applicationId;
    private String applicationDecisionPath;
    private String productCode;
    private String subProductCode;
    private String channelType;
    private String duplicateCode;
    private Boolean webAuthenticatedFlag;
    private String sourceSystemId;
    private String tenantId;
    private String applicationCreatedTimestamp;
    private String affiliateCode;
    private Integer strategySelectionRandomNumber;
    private Integer strategySelectionRandomNumber1;
    private Integer strategySelectionRandomNumber2;
    private Integer strategySelectionRandomNumber3;
    private String accountOwnershipType;
    private LoanInfo loanInfo;
    private List<FieldPair> liabilities;

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

    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getApplicationCreatedTimestamp() {
        return applicationCreatedTimestamp;
    }

    public void setApplicationCreatedTimestamp(String applicationCreatedTimestamp) {
        this.applicationCreatedTimestamp = applicationCreatedTimestamp;
    }

    public String getAffiliateCode() {
        return affiliateCode;
    }

    public void setAffiliateCode(String affiliateCode) {
        this.affiliateCode = affiliateCode;
    }

    public Integer getStrategySelectionRandomNumber() {
        return strategySelectionRandomNumber;
    }

    public void setStrategySelectionRandomNumber(Integer strategySelectionRandomNumber) {
        this.strategySelectionRandomNumber = strategySelectionRandomNumber;
    }

    public Integer getStrategySelectionRandomNumber1() {
        return strategySelectionRandomNumber1;
    }

    public void setStrategySelectionRandomNumber1(Integer strategySelectionRandomNumber1) {
        this.strategySelectionRandomNumber1 = strategySelectionRandomNumber1;
    }

    public Integer getStrategySelectionRandomNumber2() {
        return strategySelectionRandomNumber2;
    }

    public void setStrategySelectionRandomNumber2(Integer strategySelectionRandomNumber2) {
        this.strategySelectionRandomNumber2 = strategySelectionRandomNumber2;
    }

    public Integer getStrategySelectionRandomNumber3() {
        return strategySelectionRandomNumber3;
    }

    public void setStrategySelectionRandomNumber3(Integer strategySelectionRandomNumber3) {
        this.strategySelectionRandomNumber3 = strategySelectionRandomNumber3;
    }

    public String getAccountOwnershipType() {
        return accountOwnershipType;
    }

    public void setAccountOwnershipType(String accountOwnershipType) {
        this.accountOwnershipType = accountOwnershipType;
    }

    public LoanInfo getLoanInfo() {
        return loanInfo;
    }

    public void setLoanInfo(LoanInfo loanInfo) {
        this.loanInfo = loanInfo;
    }

    public List<FieldPair> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<FieldPair> liabilities) {
        this.liabilities = liabilities;
    }
}
