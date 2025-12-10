package com.example.mapstruct_demo.common.model.entity;

import java.util.List;

public class CreditBureauDataEntity {

    private List<FraudInfoEntity> fraudInfo;
    private List<HeaderEntity> header;
    private List<InquiryEntity> inquiries;
    private List<PublicRecordEntity> publicRecords;
    private List<ScoringEntity> scoring;
    private List<TradelineEntity> tradelines;
    private List<AddressEntity> address;
    private List<IdentificationEntity> identification;
    private List<NameOrAliasEntity> nameOrAlias;


    public List<FraudInfoEntity> getFraudInfo() {
        return fraudInfo;
    }

    public void setFraudInfo(List<FraudInfoEntity> fraudInfo) {
        this.fraudInfo = fraudInfo;
    }

    public List<HeaderEntity> getHeader() {
        return header;
    }

    public void setHeader(List<HeaderEntity> header) {
        this.header = header;
    }

    public List<InquiryEntity> getInquiries() {
        return inquiries;
    }

    public void setInquiries(List<InquiryEntity> inquiries) {
        this.inquiries = inquiries;
    }

    public List<PublicRecordEntity> getPublicRecords() {
        return publicRecords;
    }

    public void setPublicRecords(List<PublicRecordEntity> publicRecords) {
        this.publicRecords = publicRecords;
    }

    public List<ScoringEntity> getScoring() {
        return scoring;
    }

    public void setScoring(List<ScoringEntity> scoring) {
        this.scoring = scoring;
    }

    public List<TradelineEntity> getTradelines() {
        return tradelines;
    }

    public void setTradelines(List<TradelineEntity> tradelines) {
        this.tradelines = tradelines;
    }

    public List<AddressEntity> getAddress() {
        return address;
    }

    public void setAddress(List<AddressEntity> address) {
        this.address = address;
    }

    public List<IdentificationEntity> getIdentification() {
        return identification;
    }

    public void setIdentification(List<IdentificationEntity> identification) {
        this.identification = identification;
    }

    public List<NameOrAliasEntity> getNameOrAlias() {
        return nameOrAlias;
    }

    public void setNameOrAlias(List<NameOrAliasEntity> nameOrAlias) {
        this.nameOrAlias = nameOrAlias;
    }
}
