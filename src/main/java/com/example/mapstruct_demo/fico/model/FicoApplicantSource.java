package com.example.mapstruct_demo.fico.model;

import java.util.List;

public class FicoApplicantSource {
    private String applicantId;
    private String applicantType;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String birthDate;              // e.g. "1928-08-03"
    private String identificationType;     // e.g. "SSN"
    private String identificationValue;    // e.g. "666502133"
    private Boolean studentFlag;
    private Boolean employeeFlag;
    private Boolean wealthCustomerFlag;
    private Boolean primaryApplicantCRFnoHit;
    private Boolean primaryApplicantCBnoHit;
    private Boolean activeMilitaryDutyFlag;
    private Boolean regulationOFlag;

    // Nested structures
    private List<FicoAddressSource> addresses;
    private List<FicoIncomeSource> incomes;
    private List<FicoFieldPairSource> customerRelationshipData;
    private FicoCustomerDueDiligenceSource customerDueDiligence;

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationValue() {
        return identificationValue;
    }

    public void setIdentificationValue(String identificationValue) {
        this.identificationValue = identificationValue;
    }

    public Boolean getStudentFlag() {
        return studentFlag;
    }

    public void setStudentFlag(Boolean studentFlag) {
        this.studentFlag = studentFlag;
    }

    public Boolean getEmployeeFlag() {
        return employeeFlag;
    }

    public void setEmployeeFlag(Boolean employeeFlag) {
        this.employeeFlag = employeeFlag;
    }

    public Boolean getWealthCustomerFlag() {
        return wealthCustomerFlag;
    }

    public void setWealthCustomerFlag(Boolean wealthCustomerFlag) {
        this.wealthCustomerFlag = wealthCustomerFlag;
    }

    public Boolean getPrimaryApplicantCRFnoHit() {
        return primaryApplicantCRFnoHit;
    }

    public void setPrimaryApplicantCRFnoHit(Boolean primaryApplicantCRFnoHit) {
        this.primaryApplicantCRFnoHit = primaryApplicantCRFnoHit;
    }

    public Boolean getPrimaryApplicantCBnoHit() {
        return primaryApplicantCBnoHit;
    }

    public void setPrimaryApplicantCBnoHit(Boolean primaryApplicantCBnoHit) {
        this.primaryApplicantCBnoHit = primaryApplicantCBnoHit;
    }

    public Boolean getActiveMilitaryDutyFlag() {
        return activeMilitaryDutyFlag;
    }

    public void setActiveMilitaryDutyFlag(Boolean activeMilitaryDutyFlag) {
        this.activeMilitaryDutyFlag = activeMilitaryDutyFlag;
    }

    public Boolean getRegulationOFlag() {
        return regulationOFlag;
    }

    public void setRegulationOFlag(Boolean regulationOFlag) {
        this.regulationOFlag = regulationOFlag;
    }

    public List<FicoAddressSource> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<FicoAddressSource> addresses) {
        this.addresses = addresses;
    }

    public List<FicoIncomeSource> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<FicoIncomeSource> incomes) {
        this.incomes = incomes;
    }

    public List<FicoFieldPairSource> getCustomerRelationshipData() {
        return customerRelationshipData;
    }

    public void setCustomerRelationshipData(List<FicoFieldPairSource> customerRelationshipData) {
        this.customerRelationshipData = customerRelationshipData;
    }

    public FicoCustomerDueDiligenceSource getCustomerDueDiligence() {
        return customerDueDiligence;
    }

    public void setCustomerDueDiligence(FicoCustomerDueDiligenceSource customerDueDiligence) {
        this.customerDueDiligence = customerDueDiligence;
    }
}
