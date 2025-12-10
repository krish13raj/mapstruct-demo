package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class BureauEntity {
    private List<ApplicantCreditInfoEntity> applicantCreditInfo;
    private List<FieldPairEntity> mergedAtbAttributes;
    private List<FieldPairEntity> decisionedMergedAtbAttributes;

    public List<ApplicantCreditInfoEntity> getApplicantCreditInfo() {
        return applicantCreditInfo;
    }

    public void setApplicantCreditInfo(List<ApplicantCreditInfoEntity> applicantCreditInfo) {
        this.applicantCreditInfo = applicantCreditInfo;
    }

    public List<FieldPairEntity> getMergedAtbAttributes() {
        return mergedAtbAttributes;
    }

    public void setMergedAtbAttributes(List<FieldPairEntity> mergedAtbAttributes) {
        this.mergedAtbAttributes = mergedAtbAttributes;
    }

    public List<FieldPairEntity> getDecisionedMergedAtbAttributes() {
        return decisionedMergedAtbAttributes;
    }

    public void setDecisionedMergedAtbAttributes(List<FieldPairEntity> decisionedMergedAtbAttributes) {
        this.decisionedMergedAtbAttributes = decisionedMergedAtbAttributes;
    }
}
