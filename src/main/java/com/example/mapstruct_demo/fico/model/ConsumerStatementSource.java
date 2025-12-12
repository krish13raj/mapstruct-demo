package com.example.mapstruct_demo.fico.model;

public class ConsumerStatementSource {
    private String messageCode;
    private String reportedDate;
    private String secondaryMessageText;

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getSecondaryMessageText() {
        return secondaryMessageText;
    }

    public void setSecondaryMessageText(String secondaryMessageText) {
        this.secondaryMessageText = secondaryMessageText;
    }
}
