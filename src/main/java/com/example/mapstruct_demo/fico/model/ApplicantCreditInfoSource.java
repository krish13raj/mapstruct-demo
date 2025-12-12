package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class ApplicantCreditInfoSource {
    private String bureauUsed;
    private String applicantId;
    private String applicantType;
    private List<FieldPairSource> decisionedAtbAttributes;
    private List<FieldPairSource> atbAttributes;
    private BureauIndicatorsSource bureauIndicators;
    private CreditBureauDataSource creditBureauData;
    private ScoringDataSource scoringData;
    private List<FieldPairSource> clarityData;
    private List<FieldPairSource> reserved;

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

    public List<FieldPairSource> getDecisionedAtbAttributes() {
        return decisionedAtbAttributes;
    }

    public void setDecisionedAtbAttributes(List<FieldPairSource> decisionedAtbAttributes) {
        this.decisionedAtbAttributes = decisionedAtbAttributes;
    }

    public List<FieldPairSource> getAtbAttributes() {
        return atbAttributes;
    }

    public void setAtbAttributes(List<FieldPairSource> atbAttributes) {
        this.atbAttributes = atbAttributes;
    }

    public BureauIndicatorsSource getBureauIndicators() {
        return bureauIndicators;
    }

    public void setBureauIndicators(BureauIndicatorsSource bureauIndicators) {
        this.bureauIndicators = bureauIndicators;
    }

    public CreditBureauDataSource getCreditBureauData() {
        return creditBureauData;
    }

    public void setCreditBureauData(CreditBureauDataSource creditBureauData) {
        this.creditBureauData = creditBureauData;
    }

    public ScoringDataSource getScoringData() {
        return scoringData;
    }

    public void setScoringData(ScoringDataSource scoringData) {
        this.scoringData = scoringData;
    }

    public List<FieldPairSource> getClarityData() {
        return clarityData;
    }

    public void setClarityData(List<FieldPairSource> clarityData) {
        this.clarityData = clarityData;
    }

    public List<FieldPairSource> getReserved() {
        return reserved;
    }

    public void setReserved(List<FieldPairSource> reserved) {
        this.reserved = reserved;
    }
}
