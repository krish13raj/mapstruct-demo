package com.example.mapstruct_demo.dto;

public class FicoInput {
    public Boolean loggingOnFlag;
    public String loggingLevel;

    public Boolean getLoggingOnFlag() {
        return loggingOnFlag;
    }

    public void setLoggingOnFlag(Boolean loggingOnFlag) {
        this.loggingOnFlag = loggingOnFlag;
    }

    public String getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }
}
