package com.example.mapstruct_demo.fico.model;

public class FicoAggregate {
    private String timestamp;       // e.g. "2025-05-01T16:22:44.630Z"
    private String bomVersionId;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBomVersionId() {
        return bomVersionId;
    }

    public void setBomVersionId(String bomVersionId) {
        this.bomVersionId = bomVersionId;
    }
}
