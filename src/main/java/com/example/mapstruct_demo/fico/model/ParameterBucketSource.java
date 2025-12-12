package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class ParameterBucketSource {
    private List<FieldPairSource> fieldNameValuePair;
    private String serviceName;
    private String effectiveDate;

    public List<FieldPairSource> getFieldNameValuePair() {
        return fieldNameValuePair;
    }

    public void setFieldNameValuePair(List<FieldPairSource> fieldNameValuePair) {
        this.fieldNameValuePair = fieldNameValuePair;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
