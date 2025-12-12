package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class DecisionCodesSource {
    private List<Object> referralRules;
    private List<Object> adverseActions;

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
