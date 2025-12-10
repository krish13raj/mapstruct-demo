package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class DecisionFrameworkEntity {
    private List<FieldPairEntity> prebureau;
    private List<FieldPairEntity> postbureau;
    private String decisionedApplicant;
    private Boolean primaryApplicantCBnoHit;


    public List<FieldPairEntity> getPrebureau() {
        return prebureau;
    }

    public void setPrebureau(List<FieldPairEntity> prebureau) {
        this.prebureau = prebureau;
    }

    public List<FieldPairEntity> getPostbureau() {
        return postbureau;
    }

    public void setPostbureau(List<FieldPairEntity> postbureau) {
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
