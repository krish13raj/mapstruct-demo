package com.example.mapstruct_demo.common.model.entity;

public class ScoringEntity {
    private String score;
    private String firstReasonCode;
    private String secondReasonCode;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getFirstReasonCode() {
        return firstReasonCode;
    }

    public void setFirstReasonCode(String firstReasonCode) {
        this.firstReasonCode = firstReasonCode;
    }

    public String getSecondReasonCode() {
        return secondReasonCode;
    }

    public void setSecondReasonCode(String secondReasonCode) {
        this.secondReasonCode = secondReasonCode;
    }
}
