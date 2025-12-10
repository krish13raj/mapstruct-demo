package com.example.mapstruct_demo.dto;

public class IdentificationRecord {
    public String ssnVarationIndicator;
    public String sourceSegment;
    public String subjectSSN;

    public String getSsnVarationIndicator() {
        return ssnVarationIndicator;
    }

    public void setSsnVarationIndicator(String ssnVarationIndicator) {
        this.ssnVarationIndicator = ssnVarationIndicator;
    }

    public String getSourceSegment() {
        return sourceSegment;
    }

    public void setSourceSegment(String sourceSegment) {
        this.sourceSegment = sourceSegment;
    }

    public String getSubjectSSN() {
        return subjectSSN;
    }

    public void setSubjectSSN(String subjectSSN) {
        this.subjectSSN = subjectSSN;
    }
}
