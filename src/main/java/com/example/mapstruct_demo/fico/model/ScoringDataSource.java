package com.example.mapstruct_demo.fico.model;

public class ScoringDataSource {  private BustOutScoreSource bustOutScore;
    private FicoScoreSource ficoScore;
    private IncomeScoreSource incomeScore;
    private SureProfileScoreSource sureProfileScore;
    private ExperianResilienceScoreSource experianResilienceScore;

    public BustOutScoreSource getBustOutScore() {
        return bustOutScore;
    }

    public void setBustOutScore(BustOutScoreSource bustOutScore) {
        this.bustOutScore = bustOutScore;
    }

    public FicoScoreSource getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(FicoScoreSource ficoScore) {
        this.ficoScore = ficoScore;
    }

    public IncomeScoreSource getIncomeScore() {
        return incomeScore;
    }

    public void setIncomeScore(IncomeScoreSource incomeScore) {
        this.incomeScore = incomeScore;
    }

    public SureProfileScoreSource getSureProfileScore() {
        return sureProfileScore;
    }

    public void setSureProfileScore(SureProfileScoreSource sureProfileScore) {
        this.sureProfileScore = sureProfileScore;
    }

    public ExperianResilienceScoreSource getExperianResilienceScore() {
        return experianResilienceScore;
    }

    public void setExperianResilienceScore(ExperianResilienceScoreSource experianResilienceScore) {
        this.experianResilienceScore = experianResilienceScore;
    }
}
