package com.example.mapstruct_demo.dto;

public class ScoringData {
    public BustOutScore bustOutScore;
    public FicoScore ficoScore;
    public IncomeScore incomeScore;
    public SureProfileScore sureProfileScore;
    public ExperianResilienceScore experianResilienceScore;

    public BustOutScore getBustOutScore() {
        return bustOutScore;
    }

    public void setBustOutScore(BustOutScore bustOutScore) {
        this.bustOutScore = bustOutScore;
    }

    public FicoScore getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(FicoScore ficoScore) {
        this.ficoScore = ficoScore;
    }

    public IncomeScore getIncomeScore() {
        return incomeScore;
    }

    public void setIncomeScore(IncomeScore incomeScore) {
        this.incomeScore = incomeScore;
    }

    public SureProfileScore getSureProfileScore() {
        return sureProfileScore;
    }

    public void setSureProfileScore(SureProfileScore sureProfileScore) {
        this.sureProfileScore = sureProfileScore;
    }

    public ExperianResilienceScore getExperianResilienceScore() {
        return experianResilienceScore;
    }

    public void setExperianResilienceScore(ExperianResilienceScore experianResilienceScore) {
        this.experianResilienceScore = experianResilienceScore;
    }
}
