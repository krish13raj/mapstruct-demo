package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class CreditBureauDataSource {
    private String baseRawArf;
    private List<CollectionSource> collections;
    private List<ConsumerStatementSource> consumerStatements;
    private List<FraudInfoSource> fraudInfo;
    private List<HeaderSource> header;
    private List<InquirySource> inquiries;
    private List<PublicRecordSource> publicRecords;
    private List<ScoringSource> scoring;
    private List<TradelineSource> tradelines;
    private List<AddressSource> address;
    private List<IdentificationSource> identification;
    private List<NameOrAliasSource> nameOrAlias;

    public String getBaseRawArf() {
        return baseRawArf;
    }

    public void setBaseRawArf(String baseRawArf) {
        this.baseRawArf = baseRawArf;
    }

    public List<CollectionSource> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionSource> collections) {
        this.collections = collections;
    }

    public List<ConsumerStatementSource> getConsumerStatements() {
        return consumerStatements;
    }

    public void setConsumerStatements(List<ConsumerStatementSource> consumerStatements) {
        this.consumerStatements = consumerStatements;
    }

    public List<FraudInfoSource> getFraudInfo() {
        return fraudInfo;
    }

    public void setFraudInfo(List<FraudInfoSource> fraudInfo) {
        this.fraudInfo = fraudInfo;
    }

    public List<HeaderSource> getHeader() {
        return header;
    }

    public void setHeader(List<HeaderSource> header) {
        this.header = header;
    }

    public List<InquirySource> getInquiries() {
        return inquiries;
    }

    public void setInquiries(List<InquirySource> inquiries) {
        this.inquiries = inquiries;
    }

    public List<PublicRecordSource> getPublicRecords() {
        return publicRecords;
    }

    public void setPublicRecords(List<PublicRecordSource> publicRecords) {
        this.publicRecords = publicRecords;
    }

    public List<ScoringSource> getScoring() {
        return scoring;
    }

    public void setScoring(List<ScoringSource> scoring) {
        this.scoring = scoring;
    }

    public List<TradelineSource> getTradelines() {
        return tradelines;
    }

    public void setTradelines(List<TradelineSource> tradelines) {
        this.tradelines = tradelines;
    }

    public List<AddressSource> getAddress() {
        return address;
    }

    public void setAddress(List<AddressSource> address) {
        this.address = address;
    }

    public List<IdentificationSource> getIdentification() {
        return identification;
    }

    public void setIdentification(List<IdentificationSource> identification) {
        this.identification = identification;
    }

    public List<NameOrAliasSource> getNameOrAlias() {
        return nameOrAlias;
    }

    public void setNameOrAlias(List<NameOrAliasSource> nameOrAlias) {
        this.nameOrAlias = nameOrAlias;
    }
}
