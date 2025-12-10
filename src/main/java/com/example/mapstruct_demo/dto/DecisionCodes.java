package com.example.mapstruct_demo.dto;

import java.util.List;

public class DecisionCodes {
    public List<Object> referralRules;
    public List<Object> adverseActions;

    public List<Object> getReferralRules() {
        return referralRules;
    }

    public void setReferralRules(List<Object> referralRules) {
        this.referralRules = referralRules;
    }

    public List<Object> getAdverseActions() {
        return adverseActions;
    }

    public void setAdverseActions(List<Object> adverseActions) {
        this.adverseActions = adverseActions;
    }
}
