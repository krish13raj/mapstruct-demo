package com.example.mapstruct_demo.dto;

public class SubProductDecision {
    public DecisionCodes decisionCodes;
    public String subProductCode;
    public AbilityToRepay abilityToRepay;
    public DecisionFramework decisionFramework;

    public DecisionCodes getDecisionCodes() {
        return decisionCodes;
    }

    public void setDecisionCodes(DecisionCodes decisionCodes) {
        this.decisionCodes = decisionCodes;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public AbilityToRepay getAbilityToRepay() {
        return abilityToRepay;
    }

    public void setAbilityToRepay(AbilityToRepay abilityToRepay) {
        this.abilityToRepay = abilityToRepay;
    }

    public DecisionFramework getDecisionFramework() {
        return decisionFramework;
    }

    public void setDecisionFramework(DecisionFramework decisionFramework) {
        this.decisionFramework = decisionFramework;
    }
}
