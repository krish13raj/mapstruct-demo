package com.example.mapstruct_demo.common.model.entity;

public class FraudInfoEntity {
    private String addressCount;
    private String addressDate;
    private String ssnErrorCode;
    private FraudServicesIndicatorEntity fraudServicesIndicatorXpn;
    private FraudServicesSsnIssuedEntity fraudServicesSsnIssuedXpn;

    public String getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(String addressCount) {
        this.addressCount = addressCount;
    }

    public String getAddressDate() {
        return addressDate;
    }

    public void setAddressDate(String addressDate) {
        this.addressDate = addressDate;
    }

    public String getSsnErrorCode() {
        return ssnErrorCode;
    }

    public void setSsnErrorCode(String ssnErrorCode) {
        this.ssnErrorCode = ssnErrorCode;
    }

    public FraudServicesIndicatorEntity getFraudServicesIndicatorXpn() {
        return fraudServicesIndicatorXpn;
    }

    public void setFraudServicesIndicatorXpn(FraudServicesIndicatorEntity fraudServicesIndicatorXpn) {
        this.fraudServicesIndicatorXpn = fraudServicesIndicatorXpn;
    }

    public FraudServicesSsnIssuedEntity getFraudServicesSsnIssuedXpn() {
        return fraudServicesSsnIssuedXpn;
    }

    public void setFraudServicesSsnIssuedXpn(FraudServicesSsnIssuedEntity fraudServicesSsnIssuedXpn) {
        this.fraudServicesSsnIssuedXpn = fraudServicesSsnIssuedXpn;
    }
}
