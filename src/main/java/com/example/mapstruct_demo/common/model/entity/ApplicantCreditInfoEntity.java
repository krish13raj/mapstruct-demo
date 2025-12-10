package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class ApplicantCreditInfoEntity {
    private String bureauUsed;
    private String applicantId;
    private String applicantType;
    private List<FieldPairEntity> decisionedAtbAttributes;
    private List<FieldPairEntity> atbAttributes;
    private BureauIndicatorsEntity bureauIndicators;
    private CreditBureauDataEntity creditBureauData;
    private ScoringDataEntity scoringData;
    private List<FieldPairEntity> clarityData;
    private List<FieldPairEntity> reserved;

    public String getBureauUsed() {
        return bureauUsed;
    }

    public void setBureauUsed(String bureauUsed) {
        this.bureauUsed = bureauUsed;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public List<FieldPairEntity> getDecisionedAtbAttributes() {
        return decisionedAtbAttributes;
    }

    public void setDecisionedAtbAttributes(List<FieldPairEntity> decisionedAtbAttributes) {
        this.decisionedAtbAttributes = decisionedAtbAttributes;
    }

    public List<FieldPairEntity> getAtbAttributes() {
        return atbAttributes;
    }

    public void setAtbAttributes(List<FieldPairEntity> atbAttributes) {
        this.atbAttributes = atbAttributes;
    }

    public BureauIndicatorsEntity getBureauIndicators() {
        return bureauIndicators;
    }

    public void setBureauIndicators(BureauIndicatorsEntity bureauIndicators) {
        this.bureauIndicators = bureauIndicators;
    }

    public CreditBureauDataEntity getCreditBureauData() {
        return creditBureauData;
    }

    public void setCreditBureauData(CreditBureauDataEntity creditBureauData) {
        this.creditBureauData = creditBureauData;
    }

    public ScoringDataEntity getScoringData() {
        return scoringData;
    }

    public void setScoringData(ScoringDataEntity scoringData) {
        this.scoringData = scoringData;
    }

    public List<FieldPairEntity> getClarityData() {
        return clarityData;
    }

    public void setClarityData(List<FieldPairEntity> clarityData) {
        this.clarityData = clarityData;
    }

    public List<FieldPairEntity> getReserved() {
        return reserved;
    }

    public void setReserved(List<FieldPairEntity> reserved) {
        this.reserved = reserved;
    }
}
