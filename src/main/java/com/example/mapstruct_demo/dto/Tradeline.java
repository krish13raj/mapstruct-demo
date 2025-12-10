package com.example.mapstruct_demo.dto;

public class Tradeline {
    public String ownershipType;
    public String sourceOfRecord;
    public Boolean revolvingFlag;
    public String applicationNumber;
    public Integer monthlyPayment;
    public Integer currentBalance;
    public Boolean realEstateFlag;
    public String subscriberName;
    public Boolean dtiIncludedFlag;
    public String accountNumber;

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    public String getSourceOfRecord() {
        return sourceOfRecord;
    }

    public void setSourceOfRecord(String sourceOfRecord) {
        this.sourceOfRecord = sourceOfRecord;
    }

    public Boolean getRevolvingFlag() {
        return revolvingFlag;
    }

    public void setRevolvingFlag(Boolean revolvingFlag) {
        this.revolvingFlag = revolvingFlag;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Integer getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Integer monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Boolean getRealEstateFlag() {
        return realEstateFlag;
    }

    public void setRealEstateFlag(Boolean realEstateFlag) {
        this.realEstateFlag = realEstateFlag;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Boolean getDtiIncludedFlag() {
        return dtiIncludedFlag;
    }

    public void setDtiIncludedFlag(Boolean dtiIncludedFlag) {
        this.dtiIncludedFlag = dtiIncludedFlag;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
