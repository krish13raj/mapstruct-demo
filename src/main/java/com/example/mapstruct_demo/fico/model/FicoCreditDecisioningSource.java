package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class FicoCreditDecisioningSource {

    private BureauSource bureau;
    private List<Object> customScore;   // refine type if schema known
    private DecisioningSource decisioning;

    public BureauSource getBureau() {
        return bureau;
    }

    public void setBureau(BureauSource bureau) {
        this.bureau = bureau;
    }

    public List<Object> getCustomScore() {
        return customScore;
    }

    public void setCustomScore(List<Object> customScore) {
        this.customScore = customScore;
    }

    public DecisioningSource getDecisioning() {
        return decisioning;
    }

    public void setDecisioning(DecisioningSource decisioning) {
        this.decisioning = decisioning;
    }
}
