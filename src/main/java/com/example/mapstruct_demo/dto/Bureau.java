package com.example.mapstruct_demo.dto;

import java.util.List;

public class Bureau {
    private List<ApplicantCreditInfo> applicantCreditInfo;
    private List<FieldPair> mergedAtbAttributes;
    private List<FieldPair> decisionedMergedAtbAttributes;

    public List<ApplicantCreditInfo> getApplicantCreditInfo() {
        return applicantCreditInfo;
    }

    public void setApplicantCreditInfo(List<ApplicantCreditInfo> applicantCreditInfo) {
        this.applicantCreditInfo = applicantCreditInfo;
    }

    public List<FieldPair> getMergedAtbAttributes() {
        return mergedAtbAttributes;
    }

    public void setMergedAtbAttributes(List<FieldPair> mergedAtbAttributes) {
        this.mergedAtbAttributes = mergedAtbAttributes;
    }

    public List<FieldPair> getDecisionedMergedAtbAttributes() {
        return decisionedMergedAtbAttributes;
    }

    public void setDecisionedMergedAtbAttributes(List<FieldPair> decisionedMergedAtbAttributes) {
        this.decisionedMergedAtbAttributes = decisionedMergedAtbAttributes;
    }
}
