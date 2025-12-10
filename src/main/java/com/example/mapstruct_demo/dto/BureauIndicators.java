package com.example.mapstruct_demo.dto;

public class BureauIndicators {
    private Boolean indicatorNoHit;
    private Boolean indicatorFrozenFile;
    private Boolean indicatorLockedFile;
    private Boolean bureauEvidenceOfConsumerStatementFlag;
    private Boolean bureauEvidenceOfDeceasedFlag;
    private String bureauEvidenceOfConsumerStatementAlertType;
    private Boolean creditBureauStaleDataFlag;

    public Boolean getIndicatorNoHit() {
        return indicatorNoHit;
    }

    public void setIndicatorNoHit(Boolean indicatorNoHit) {
        this.indicatorNoHit = indicatorNoHit;
    }

    public Boolean getIndicatorFrozenFile() {
        return indicatorFrozenFile;
    }

    public void setIndicatorFrozenFile(Boolean indicatorFrozenFile) {
        this.indicatorFrozenFile = indicatorFrozenFile;
    }

    public Boolean getIndicatorLockedFile() {
        return indicatorLockedFile;
    }

    public void setIndicatorLockedFile(Boolean indicatorLockedFile) {
        this.indicatorLockedFile = indicatorLockedFile;
    }

    public Boolean getBureauEvidenceOfConsumerStatementFlag() {
        return bureauEvidenceOfConsumerStatementFlag;
    }

    public void setBureauEvidenceOfConsumerStatementFlag(Boolean bureauEvidenceOfConsumerStatementFlag) {
        this.bureauEvidenceOfConsumerStatementFlag = bureauEvidenceOfConsumerStatementFlag;
    }

    public Boolean getBureauEvidenceOfDeceasedFlag() {
        return bureauEvidenceOfDeceasedFlag;
    }

    public void setBureauEvidenceOfDeceasedFlag(Boolean bureauEvidenceOfDeceasedFlag) {
        this.bureauEvidenceOfDeceasedFlag = bureauEvidenceOfDeceasedFlag;
    }

    public String getBureauEvidenceOfConsumerStatementAlertType() {
        return bureauEvidenceOfConsumerStatementAlertType;
    }

    public void setBureauEvidenceOfConsumerStatementAlertType(String bureauEvidenceOfConsumerStatementAlertType) {
        this.bureauEvidenceOfConsumerStatementAlertType = bureauEvidenceOfConsumerStatementAlertType;
    }

    public Boolean getCreditBureauStaleDataFlag() {
        return creditBureauStaleDataFlag;
    }

    public void setCreditBureauStaleDataFlag(Boolean creditBureauStaleDataFlag) {
        this.creditBureauStaleDataFlag = creditBureauStaleDataFlag;
    }
}
