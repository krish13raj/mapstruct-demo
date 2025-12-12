package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class FicoOutputSource {
    private List<Object> decisionTraces;
    private List<Object> logs;

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
