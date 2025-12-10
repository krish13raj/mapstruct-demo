package com.example.mapstruct_demo.fico.model;

public class FicoIncomeSource {
    private Double yearlyStatedIncomeAmount;
    private Double monthlyStateIncomeAmount;
    private Boolean validatedIncomeFlag;

    public Double getYearlyStatedIncomeAmount() {
        return yearlyStatedIncomeAmount;
    }

    public void setYearlyStatedIncomeAmount(Double yearlyStatedIncomeAmount) {
        this.yearlyStatedIncomeAmount = yearlyStatedIncomeAmount;
    }

    public Double getMonthlyStateIncomeAmount() {
        return monthlyStateIncomeAmount;
    }

    public void setMonthlyStateIncomeAmount(Double monthlyStateIncomeAmount) {
        this.monthlyStateIncomeAmount = monthlyStateIncomeAmount;
    }

    public Boolean getValidatedIncomeFlag() {
        return validatedIncomeFlag;
    }

    public void setValidatedIncomeFlag(Boolean validatedIncomeFlag) {
        this.validatedIncomeFlag = validatedIncomeFlag;
    }
}
