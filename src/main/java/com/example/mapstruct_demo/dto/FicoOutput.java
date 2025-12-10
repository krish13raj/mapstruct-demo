package com.example.mapstruct_demo.dto;

import java.util.List;

public class FicoOutput {
    public List<Object> decisionTraces;
    public List<Object> logs;

    public List<Object> getDecisionTraces() {
        return decisionTraces;
    }

    public void setDecisionTraces(List<Object> decisionTraces) {
        this.decisionTraces = decisionTraces;
    }

    public List<Object> getLogs() {
        return logs;
    }

    public void setLogs(List<Object> logs) {
        this.logs = logs;
    }
}
