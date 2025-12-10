package com.example.mapstruct_demo.dto;

public class Income {
    private Double yearlyStatedIncomeAmount;
    private String incomeId;
    private Double monthlyStateIncomeAmount;
    private String incomeType;
    private Double yearlyVerifiedIncomeAmount;
    private Double yearlyStatedAffirmIncomeAmount;
    private Double monthlyStatedAffirmIncomeAmount;
    private Boolean validatedIncomeFlag;
    private String sourceOfIncome;
    private Double monthlyVerifiedIncomeAmount;

    public Double getYearlyStatedIncomeAmount() {
        return yearlyStatedIncomeAmount;
    }

    public void setYearlyStatedIncomeAmount(Double yearlyStatedIncomeAmount) {
        this.yearlyStatedIncomeAmount = yearlyStatedIncomeAmount;
    }

    public String getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    public Double getMonthlyStateIncomeAmount() {
        return monthlyStateIncomeAmount;
    }

    public void setMonthlyStateIncomeAmount(Double monthlyStateIncomeAmount) {
        this.monthlyStateIncomeAmount = monthlyStateIncomeAmount;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public Double getYearlyVerifiedIncomeAmount() {
        return yearlyVerifiedIncomeAmount;
    }

    public void setYearlyVerifiedIncomeAmount(Double yearlyVerifiedIncomeAmount) {
        this.yearlyVerifiedIncomeAmount = yearlyVerifiedIncomeAmount;
    }

    public Double getYearlyStatedAffirmIncomeAmount() {
        return yearlyStatedAffirmIncomeAmount;
    }

    public void setYearlyStatedAffirmIncomeAmount(Double yearlyStatedAffirmIncomeAmount) {
        this.yearlyStatedAffirmIncomeAmount = yearlyStatedAffirmIncomeAmount;
    }

    public Double getMonthlyStatedAffirmIncomeAmount() {
        return monthlyStatedAffirmIncomeAmount;
    }

    public void setMonthlyStatedAffirmIncomeAmount(Double monthlyStatedAffirmIncomeAmount) {
        this.monthlyStatedAffirmIncomeAmount = monthlyStatedAffirmIncomeAmount;
    }

    public Boolean getValidatedIncomeFlag() {
        return validatedIncomeFlag;
    }

    public void setValidatedIncomeFlag(Boolean validatedIncomeFlag) {
        this.validatedIncomeFlag = validatedIncomeFlag;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public Double getMonthlyVerifiedIncomeAmount() {
        return monthlyVerifiedIncomeAmount;
    }

    public void setMonthlyVerifiedIncomeAmount(Double monthlyVerifiedIncomeAmount) {
        this.monthlyVerifiedIncomeAmount = monthlyVerifiedIncomeAmount;
    }
}
