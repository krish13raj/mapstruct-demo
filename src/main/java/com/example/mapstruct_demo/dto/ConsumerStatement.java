package com.example.mapstruct_demo.dto;

public class ConsumerStatement {
    public String messageCode;
    public String reportedDate;
    public String secondaryMessageText;
    public String sourceSegment;
    public String y2kReportDate;

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

    public String getSourceSegment() {
        return sourceSegment;
    }

    public void setSourceSegment(String sourceSegment) {
        this.sourceSegment = sourceSegment;
    }

    public String getY2kReportDate() {
        return y2kReportDate;
    }

    public void setY2kReportDate(String y2kReportDate) {
        this.y2kReportDate = y2kReportDate;
    }
}
