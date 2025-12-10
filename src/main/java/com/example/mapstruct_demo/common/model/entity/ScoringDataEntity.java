package com.example.mapstruct_demo.common.model.entity;

public class ScoringDataEntity {
    private BustOutScoreEntity bustOutScore;
    private FicoScoreEntity ficoScore;
    private IncomeScoreEntity incomeScore;
    private SureProfileScoreEntity sureProfileScore;
    private ExperianResilienceScoreEntity experianResilienceScore;

    public BustOutScoreEntity getBustOutScore() {
        return bustOutScore;
    }

    public void setBustOutScore(BustOutScoreEntity bustOutScore) {
        this.bustOutScore = bustOutScore;
    }

    public FicoScoreEntity getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(FicoScoreEntity ficoScore) {
        this.ficoScore = ficoScore;
    }

    public IncomeScoreEntity getIncomeScore() {
        return incomeScore;
    }

    public void setIncomeScore(IncomeScoreEntity incomeScore) {
        this.incomeScore = incomeScore;
    }

    public SureProfileScoreEntity getSureProfileScore() {
        return sureProfileScore;
    }

    public void setSureProfileScore(SureProfileScoreEntity sureProfileScore) {
        this.sureProfileScore = sureProfileScore;
    }

    public ExperianResilienceScoreEntity getExperianResilienceScore() {
        return experianResilienceScore;
    }

    public void setExperianResilienceScore(ExperianResilienceScoreEntity experianResilienceScore) {
        this.experianResilienceScore = experianResilienceScore;
    }
}
