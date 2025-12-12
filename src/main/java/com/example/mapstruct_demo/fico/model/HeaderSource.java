package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class HeaderSource {
    private java.util.List<String> errorMessageCode;
    private String bureauArfVersion;
    private String bureauQueried;
    private String reportDate;
    private String reportTime;

    public List<String> getErrorMessageCode() {
        return errorMessageCode;
    }

    public void setErrorMessageCode(List<String> errorMessageCode) {
        this.errorMessageCode = errorMessageCode;
    }

    public String getBureauArfVersion() {
        return bureauArfVersion;
    }

    public void setBureauArfVersion(String bureauArfVersion) {
        this.bureauArfVersion = bureauArfVersion;
    }

    public String getBureauQueried() {
        return bureauQueried;
    }

    public void setBureauQueried(String bureauQueried) {
        this.bureauQueried = bureauQueried;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }
}
