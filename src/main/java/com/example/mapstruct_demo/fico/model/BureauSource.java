package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class BureauSource {
    private List<ApplicantCreditInfoSource> applicantCreditInfo;
    private List<FieldPairSource> mergedAtbAttributes;
    private List<FieldPairSource> decisionedMergedAtbAttributes;


    public List<ApplicantCreditInfoSource> getApplicantCreditInfo() {
        return applicantCreditInfo;
    }

    public void setApplicantCreditInfo(List<ApplicantCreditInfoSource> applicantCreditInfo) {
        this.applicantCreditInfo = applicantCreditInfo;
    }

    public List<FieldPairSource> getMergedAtbAttributes() {
        return mergedAtbAttributes;
    }

    public void setMergedAtbAttributes(List<FieldPairSource> mergedAtbAttributes) {
        this.mergedAtbAttributes = mergedAtbAttributes;
    }

    public List<FieldPairSource> getDecisionedMergedAtbAttributes() {
        return decisionedMergedAtbAttributes;
    }

    public void setDecisionedMergedAtbAttributes(List<FieldPairSource> decisionedMergedAtbAttributes) {
        this.decisionedMergedAtbAttributes = decisionedMergedAtbAttributes;
    }
}
