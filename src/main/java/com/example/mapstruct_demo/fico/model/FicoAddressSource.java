package com.example.mapstruct_demo.fico.model;

public class FicoAddressSource {
    private String zipCode;
    private String city;
    private String state;
    private String addressLine1;
    private String addressType;
    private Boolean currentAddressFlag;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Boolean getCurrentAddressFlag() {
        return currentAddressFlag;
    }

    public void setCurrentAddressFlag(Boolean currentAddressFlag) {
        this.currentAddressFlag = currentAddressFlag;
    }
}
