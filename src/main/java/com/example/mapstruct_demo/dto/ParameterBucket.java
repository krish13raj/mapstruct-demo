package com.example.mapstruct_demo.dto;

import java.util.List;

public class ParameterBucket {
    public List<FieldPair> fieldNameValuePair;
    public String serviceName;
    public String effectiveDate;

    public List<FieldPair> getFieldNameValuePair() {
        return fieldNameValuePair;
    }

    public void setFieldNameValuePair(List<FieldPair> fieldNameValuePair) {
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
