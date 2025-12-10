package com.example.mapstruct_demo.dto;

import java.util.List;

public class HeaderRecord {
    public List<String> errorMessageCode;
    public String bureauArfVersion;
    public String bureauQueried;
    public String preamble;
    public String reportDate;
    public String reportTime;

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

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
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
