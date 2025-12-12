package com.example.mapstruct_demo.fico.model;

public class SubProductDecisionSource {
    private DecisionCodesSource decisionCodes;
    private String subProductCode;
    private AbilityToRepaySource abilityToRepay;
    private DecisionFrameworkSource decisionFramework;

    public DecisionCodesSource getDecisionCodes() {
        return decisionCodes;
    }

    public void setDecisionCodes(DecisionCodesSource decisionCodes) {
        this.decisionCodes = decisionCodes;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public AbilityToRepaySource getAbilityToRepay() {
        return abilityToRepay;
    }

    public void setAbilityToRepay(AbilityToRepaySource abilityToRepay) {
        this.abilityToRepay = abilityToRepay;
    }

    public DecisionFrameworkSource getDecisionFramework() {
        return decisionFramework;
    }

    public void setDecisionFramework(DecisionFrameworkSource decisionFramework) {
        this.decisionFramework = decisionFramework;
    }
}
