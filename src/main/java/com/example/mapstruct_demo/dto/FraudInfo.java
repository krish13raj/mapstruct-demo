package com.example.mapstruct_demo.dto;

public class FraudInfo {
    public String addressCount;
    public String addressDate;
    public String addressErrorCode;
    public FraudServicesIndicatorXpn fraudServicesIndicatorXpn;
    public FraudServicesSsnIssuedXpn fraudServicesSsnIssuedXpn;
    public String recordType;
    public String sourceSegment;
    public String ssnCounter;
    public String ssnDate;
    public String ssnErrorCode;
    public String y2kAddressDate;
    public String y2kSsnDate;

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

    public String getAddressErrorCode() {
        return addressErrorCode;
    }

    public void setAddressErrorCode(String addressErrorCode) {
        this.addressErrorCode = addressErrorCode;
    }

    public FraudServicesIndicatorXpn getFraudServicesIndicatorXpn() {
        return fraudServicesIndicatorXpn;
    }

    public void setFraudServicesIndicatorXpn(FraudServicesIndicatorXpn fraudServicesIndicatorXpn) {
        this.fraudServicesIndicatorXpn = fraudServicesIndicatorXpn;
    }

    public FraudServicesSsnIssuedXpn getFraudServicesSsnIssuedXpn() {
        return fraudServicesSsnIssuedXpn;
    }

    public void setFraudServicesSsnIssuedXpn(FraudServicesSsnIssuedXpn fraudServicesSsnIssuedXpn) {
        this.fraudServicesSsnIssuedXpn = fraudServicesSsnIssuedXpn;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getSourceSegment() {
        return sourceSegment;
    }

    public void setSourceSegment(String sourceSegment) {
        this.sourceSegment = sourceSegment;
    }

    public String getSsnCounter() {
        return ssnCounter;
    }

    public void setSsnCounter(String ssnCounter) {
        this.ssnCounter = ssnCounter;
    }

    public String getSsnDate() {
        return ssnDate;
    }

    public void setSsnDate(String ssnDate) {
        this.ssnDate = ssnDate;
    }

    public String getSsnErrorCode() {
        return ssnErrorCode;
    }

    public void setSsnErrorCode(String ssnErrorCode) {
        this.ssnErrorCode = ssnErrorCode;
    }

    public String getY2kAddressDate() {
        return y2kAddressDate;
    }

    public void setY2kAddressDate(String y2kAddressDate) {
        this.y2kAddressDate = y2kAddressDate;
    }

    public String getY2kSsnDate() {
        return y2kSsnDate;
    }

    public void setY2kSsnDate(String y2kSsnDate) {
        this.y2kSsnDate = y2kSsnDate;
    }
}
