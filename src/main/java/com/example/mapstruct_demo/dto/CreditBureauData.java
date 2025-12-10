package com.example.mapstruct_demo.dto;

import java.util.List;

public class CreditBureauData {
    private String baseRawArf;
    private List<CollectionRecord> collections;
    private List<ConsumerStatement> consumerStatements;
    private List<FraudInfo> fraudInfo;
    private List<HeaderRecord> header;
    private List<InquiryRecord> inquiries;
    private List<PublicRecord> publicRecords;
    private List<ScoringRecord> scoring;
    private List<Tradeline> tradelines;
    private List<AddressRecord> address;
    private List<IdentificationRecord> identification;
    private List<NameOrAlias> nameOrAlias;

    public String getBaseRawArf() {
        return baseRawArf;
    }

    public void setBaseRawArf(String baseRawArf) {
        this.baseRawArf = baseRawArf;
    }

    public List<CollectionRecord> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionRecord> collections) {
        this.collections = collections;
    }

    public List<ConsumerStatement> getConsumerStatements() {
        return consumerStatements;
    }

    public void setConsumerStatements(List<ConsumerStatement> consumerStatements) {
        this.consumerStatements = consumerStatements;
    }

    public List<FraudInfo> getFraudInfo() {
        return fraudInfo;
    }

    public void setFraudInfo(List<FraudInfo> fraudInfo) {
        this.fraudInfo = fraudInfo;
    }

    public List<HeaderRecord> getHeader() {
        return header;
    }

    public void setHeader(List<HeaderRecord> header) {
        this.header = header;
    }

    public List<InquiryRecord> getInquiries() {
        return inquiries;
    }

    public void setInquiries(List<InquiryRecord> inquiries) {
        this.inquiries = inquiries;
    }

    public List<PublicRecord> getPublicRecords() {
        return publicRecords;
    }

    public void setPublicRecords(List<PublicRecord> publicRecords) {
        this.publicRecords = publicRecords;
    }

    public List<ScoringRecord> getScoring() {
        return scoring;
    }

    public void setScoring(List<ScoringRecord> scoring) {
        this.scoring = scoring;
    }

    public List<Tradeline> getTradelines() {
        return tradelines;
    }

    public void setTradelines(List<Tradeline> tradelines) {
        this.tradelines = tradelines;
    }

    public List<AddressRecord> getAddress() {
        return address;
    }

    public void setAddress(List<AddressRecord> address) {
        this.address = address;
    }

    public List<IdentificationRecord> getIdentification() {
        return identification;
    }

    public void setIdentification(List<IdentificationRecord> identification) {
        this.identification = identification;
    }

    public List<NameOrAlias> getNameOrAlias() {
        return nameOrAlias;
    }

    public void setNameOrAlias(List<NameOrAlias> nameOrAlias) {
        this.nameOrAlias = nameOrAlias;
    }
}
