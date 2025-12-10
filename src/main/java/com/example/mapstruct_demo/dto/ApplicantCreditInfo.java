package com.example.mapstruct_demo.dto;

import java.util.List;
import java.util.Map;

public class ApplicantCreditInfo {
    private String bureauUsed;
    private String applicantId;
    private String applicantType;
    private List<FieldPair> decisionedAtbAttributes;
    private List<FieldPair> atbAttributes;
    private BureauIndicators bureauIndicators;
    private CreditBureauData creditBureauData;
    private Map<String, Object> reachData; // {}
    private ScoringData scoringData;
    private List<FieldPair> clarityData;
    private List<FieldPair> reserved;

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

    public List<FieldPair> getDecisionedAtbAttributes() {
        return decisionedAtbAttributes;
    }

    public void setDecisionedAtbAttributes(List<FieldPair> decisionedAtbAttributes) {
        this.decisionedAtbAttributes = decisionedAtbAttributes;
    }

    public List<FieldPair> getAtbAttributes() {
        return atbAttributes;
    }

    public void setAtbAttributes(List<FieldPair> atbAttributes) {
        this.atbAttributes = atbAttributes;
    }

    public BureauIndicators getBureauIndicators() {
        return bureauIndicators;
    }

    public void setBureauIndicators(BureauIndicators bureauIndicators) {
        this.bureauIndicators = bureauIndicators;
    }

    public CreditBureauData getCreditBureauData() {
        return creditBureauData;
    }

    public void setCreditBureauData(CreditBureauData creditBureauData) {
        this.creditBureauData = creditBureauData;
    }

    public Map<String, Object> getReachData() {
        return reachData;
    }

    public void setReachData(Map<String, Object> reachData) {
        this.reachData = reachData;
    }

    public ScoringData getScoringData() {
        return scoringData;
    }

    public void setScoringData(ScoringData scoringData) {
        this.scoringData = scoringData;
    }

    public List<FieldPair> getClarityData() {
        return clarityData;
    }

    public void setClarityData(List<FieldPair> clarityData) {
        this.clarityData = clarityData;
    }

    public List<FieldPair> getReserved() {
        return reserved;
    }

    public void setReserved(List<FieldPair> reserved) {
        this.reserved = reserved;
    }
}
