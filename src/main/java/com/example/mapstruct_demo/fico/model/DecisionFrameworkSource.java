package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class DecisionFrameworkSource {
    private List<FieldPairSource> prebureau;
    private List<FieldPairSource> postbureau;
    private String decisionedApplicant;
    private Boolean primaryApplicantCBnoHit;

    public List<FieldPairSource> getPrebureau() {
        return prebureau;
    }

    public void setPrebureau(List<FieldPairSource> prebureau) {
        this.prebureau = prebureau;
    }

    public List<FieldPairSource> getPostbureau() {
        return postbureau;
    }

    public void setPostbureau(List<FieldPairSource> postbureau) {
        this.postbureau = postbureau;
    }

    public String getDecisionedApplicant() {
        return decisionedApplicant;
    }

    public void setDecisionedApplicant(String decisionedApplicant) {
        this.decisionedApplicant = decisionedApplicant;
    }

    public Boolean getPrimaryApplicantCBnoHit() {
        return primaryApplicantCBnoHit;
    }

    public void setPrimaryApplicantCBnoHit(Boolean primaryApplicantCBnoHit) {
        this.primaryApplicantCBnoHit = primaryApplicantCBnoHit;
    }
}
