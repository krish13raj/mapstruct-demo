package com.example.mapstruct_demo.dto;

public class SampleRequestWrapper {
    private String name;               // "TransactionInput"
    private TransactionInput value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransactionInput getValue() {
        return value;
    }

    public void setValue(TransactionInput value) {
        this.value = value;
    }
}
