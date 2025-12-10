package com.example.mapstruct_demo.common.model.entity;

public class SubProductDecisionEntity {
    private DecisionCodesEntity decisionCodes;
    private String subProductCode;
    private AbilityToRepayEntity abilityToRepay;
    private DecisionFrameworkEntity decisionFramework;

    public DecisionCodesEntity getDecisionCodes() {
        return decisionCodes;
    }

    public void setDecisionCodes(DecisionCodesEntity decisionCodes) {
        this.decisionCodes = decisionCodes;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public AbilityToRepayEntity getAbilityToRepay() {
        return abilityToRepay;
    }

    public void setAbilityToRepay(AbilityToRepayEntity abilityToRepay) {
        this.abilityToRepay = abilityToRepay;
    }

    public DecisionFrameworkEntity getDecisionFramework() {
        return decisionFramework;
    }

    public void setDecisionFramework(DecisionFrameworkEntity decisionFramework) {
        this.decisionFramework = decisionFramework;
    }
}
