package com.example.mapstruct_demo.common.model.entity;

public class TradelineEntity {
    private String accountNumber;
    private String subscriberName;
    private Integer monthlyPayment;
    private Integer currentBalance;
    private Boolean revolvingFlag;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Integer getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Integer monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Boolean getRevolvingFlag() {
        return revolvingFlag;
    }

    public void setRevolvingFlag(Boolean revolvingFlag) {
        this.revolvingFlag = revolvingFlag;
    }
}
