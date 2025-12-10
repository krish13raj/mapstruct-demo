package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class CreditDecisioningEntity {
    private BureauEntity bureau;
    private List<Object> customScore; // can be refined if you have a schema
    private DecisioningEntity decisioning;

    public BureauEntity getBureau() {
        return bureau;
    }

    public void setBureau(BureauEntity bureau) {
        this.bureau = bureau;
    }

    public List<Object> getCustomScore() {
        return customScore;
    }

    public void setCustomScore(List<Object> customScore) {
        this.customScore = customScore;
    }

    public DecisioningEntity getDecisioning() {
        return decisioning;
    }

    public void setDecisioning(DecisioningEntity decisioning) {
        this.decisioning = decisioning;
    }
}
