package com.example.mapstruct_demo.common.model.entity;

public class LoanInfoEntity {
    private String loanPurpose;
    private String requestedLoanAmount;
    private String requestedTerm;
    private String loanType;
    private Double discount;

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getRequestedLoanAmount() {
        return requestedLoanAmount;
    }

    public void setRequestedLoanAmount(String requestedLoanAmount) {
        this.requestedLoanAmount = requestedLoanAmount;
    }

    public String getRequestedTerm() {
        return requestedTerm;
    }

    public void setRequestedTerm(String requestedTerm) {
        this.requestedTerm = requestedTerm;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
