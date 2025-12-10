package com.example.mapstruct_demo.dto;

public class AddressValidationDetails {
    private String deliveryPointValidationVacantFlag;
    private String deliveryPointValidationFootnote;
    private String residentialDeliveryIndicatorCode;
    private String geoUsfipsStateCountyCode;
    private String addressLocRecordType;
    private String commercialMailReceivingAgency;
    private String addressStatus;
    private String deliveryPointValidationCode;
    private String addressStatusDescription;

    public String getDeliveryPointValidationVacantFlag() {
        return deliveryPointValidationVacantFlag;
    }

    public void setDeliveryPointValidationVacantFlag(String deliveryPointValidationVacantFlag) {
        this.deliveryPointValidationVacantFlag = deliveryPointValidationVacantFlag;
    }

    public String getDeliveryPointValidationFootnote() {
        return deliveryPointValidationFootnote;
    }

    public void setDeliveryPointValidationFootnote(String deliveryPointValidationFootnote) {
        this.deliveryPointValidationFootnote = deliveryPointValidationFootnote;
    }

    public String getResidentialDeliveryIndicatorCode() {
        return residentialDeliveryIndicatorCode;
    }

    public void setResidentialDeliveryIndicatorCode(String residentialDeliveryIndicatorCode) {
        this.residentialDeliveryIndicatorCode = residentialDeliveryIndicatorCode;
    }

    public String getGeoUsfipsStateCountyCode() {
        return geoUsfipsStateCountyCode;
    }

    public void setGeoUsfipsStateCountyCode(String geoUsfipsStateCountyCode) {
        this.geoUsfipsStateCountyCode = geoUsfipsStateCountyCode;
    }

    public String getAddressLocRecordType() {
        return addressLocRecordType;
    }

    public void setAddressLocRecordType(String addressLocRecordType) {
        this.addressLocRecordType = addressLocRecordType;
    }

    public String getCommercialMailReceivingAgency() {
        return commercialMailReceivingAgency;
    }

    public void setCommercialMailReceivingAgency(String commercialMailReceivingAgency) {
        this.commercialMailReceivingAgency = commercialMailReceivingAgency;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getDeliveryPointValidationCode() {
        return deliveryPointValidationCode;
    }

    public void setDeliveryPointValidationCode(String deliveryPointValidationCode) {
        this.deliveryPointValidationCode = deliveryPointValidationCode;
    }

    public String getAddressStatusDescription() {
        return addressStatusDescription;
    }

    public void setAddressStatusDescription(String addressStatusDescription) {
        this.addressStatusDescription = addressStatusDescription;
    }
}
