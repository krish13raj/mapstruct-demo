package com.example.mapstruct_demo.dto;

import java.util.List;

public class CreditDecisioning {
    private Bureau bureau;
    private List<Object> customScore; // []
    private Decisioning decisioning;

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public List<Object> getCustomScore() {
        return customScore;
    }

    public void setCustomScore(List<Object> customScore) {
        this.customScore = customScore;
    }

    public Decisioning getDecisioning() {
        return decisioning;
    }

    public void setDecisioning(Decisioning decisioning) {
        this.decisioning = decisioning;
    }
}
