package com.example.mapstruct_demo.dto;

public class Address {

    private String zipCode;
    private String lmiIndicator;
    private String city;
    private String countryCode;
    private String addressType;
    private String addressLine1;
    private Boolean currentAddressFlag;
    private String addressLine2;
    private String state;
    private AddressValidationDetails addressValidationDetails;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLmiIndicator() {
        return lmiIndicator;
    }

    public void setLmiIndicator(String lmiIndicator) {
        this.lmiIndicator = lmiIndicator;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Boolean getCurrentAddressFlag() {
        return currentAddressFlag;
    }

    public void setCurrentAddressFlag(Boolean currentAddressFlag) {
        this.currentAddressFlag = currentAddressFlag;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AddressValidationDetails getAddressValidationDetails() {
        return addressValidationDetails;
    }

    public void setAddressValidationDetails(AddressValidationDetails addressValidationDetails) {
        this.addressValidationDetails = addressValidationDetails;
    }
}
