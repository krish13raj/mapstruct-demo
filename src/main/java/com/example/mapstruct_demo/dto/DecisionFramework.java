package com.example.mapstruct_demo.dto;

import java.util.List;

public class DecisionFramework {
    public List<FieldPair> prebureau;
    public List<FieldPair> postbureau;
    public String decisionedApplicant;
    public Boolean primaryApplicantCBnoHit;

    public List<FieldPair> getPrebureau() {
        return prebureau;
    }

    public void setPrebureau(List<FieldPair> prebureau) {
        this.prebureau = prebureau;
    }

    public List<FieldPair> getPostbureau() {
        return postbureau;
    }

    public void setPostbureau(List<FieldPair> postbureau) {
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
