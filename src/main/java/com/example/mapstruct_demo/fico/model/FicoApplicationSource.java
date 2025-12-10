package com.example.mapstruct_demo.fico.model;

import java.time.LocalDate;

public class FicoApplicationSource {

    private String applicationId;
    private String decisionPath;
    private String productCode;
    private String subProductCode;
    private String channelType;
    private String duplicateCode;
    private Boolean webAuthenticatedFlag;
    private String sourceSystemId;
    private String tenantId;
    private LocalDate applicationCreatedTimestamp;
    private String affiliateCode;
    private Integer strategySelectionRandomNumber;
    private Integer strategySelectionRandomNumber1;
    private Integer strategySelectionRandomNumber2;
    private Integer strategySelectionRandomNumber3;
    private String accountOwnershipType;

    // Loan info nested
    private String loanPurpose;
    private String requestedLoanAmount;
    private String requestedTerm;
    private String loanType;
    private Double discount;


    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getDecisionPath() {
        return decisionPath;
    }

    public void setDecisionPath(String decisionPath) {
        this.decisionPath = decisionPath;
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

    public LocalDate getApplicationCreatedTimestamp() {
        return applicationCreatedTimestamp;
    }

    public void setApplicationCreatedTimestamp(LocalDate applicationCreatedTimestamp) {
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

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getRequestedLoanAmount() {
        return requestedLoanAmount;
    }

    public void setRequestedLoanAmount(String requestedLoanAmount) {
        this.requestedLoanAmount = requestedLoanAmount;
    }

    public String getRequestedTerm() {
        return requestedTerm;
    }

    public void setRequestedTerm(String requestedTerm) {
        this.requestedTerm = requestedTerm;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
