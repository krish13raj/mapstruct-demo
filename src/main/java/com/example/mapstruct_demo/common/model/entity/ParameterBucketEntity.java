package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class ParameterBucketEntity {
    private List<FieldPairEntity> fieldNameValuePair;
    private String serviceName;
    private String effectiveDate;

    public List<FieldPairEntity> getFieldNameValuePair() {
        return fieldNameValuePair;
    }

    public void setFieldNameValuePair(List<FieldPairEntity> fieldNameValuePair) {
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
