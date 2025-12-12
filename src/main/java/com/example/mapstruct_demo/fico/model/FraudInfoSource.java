package com.example.mapstruct_demo.fico.model;

public class FraudInfoSource {
    private String addressCount;
    private String addressDate;
    private String ssnErrorCode;
    private FraudServicesIndicatorSource fraudServicesIndicatorXpn;
    private FraudServicesSsnIssuedSource fraudServicesSsnIssuedXpn;

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

    public FraudServicesIndicatorSource getFraudServicesIndicatorXpn() {
        return fraudServicesIndicatorXpn;
    }

    public void setFraudServicesIndicatorXpn(FraudServicesIndicatorSource fraudServicesIndicatorXpn) {
        this.fraudServicesIndicatorXpn = fraudServicesIndicatorXpn;
    }

    public FraudServicesSsnIssuedSource getFraudServicesSsnIssuedXpn() {
        return fraudServicesSsnIssuedXpn;
    }

    public void setFraudServicesSsnIssuedXpn(FraudServicesSsnIssuedSource fraudServicesSsnIssuedXpn) {
        this.fraudServicesSsnIssuedXpn = fraudServicesSsnIssuedXpn;
    }
}
