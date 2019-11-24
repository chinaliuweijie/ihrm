package com.ihrm.domain.company;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "co_company", schema = "ihrm", catalog = "")
public class CoCompanyEntity {
    private String id;
    private String name;
    private String managerId;
    private String version;
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp renewalDate;
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp expirationDate;
    private String companyArea;
    private String companyAddress;
    private String businessLicenseId;
    private String legalRepresentative;
    private String companyPhone;
    private String mailbox;
    private String companySize;
    private String industry;
    private String remarks;
    private String auditState;
    private byte state;
    private double balance;
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "manager_id")
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "renewal_date")
    public Timestamp getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Timestamp renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Basic
    @Column(name = "expiration_date")
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "company_area")
    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    @Basic
    @Column(name = "company_address")
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "business_license_id")
    public String getBusinessLicenseId() {
        return businessLicenseId;
    }

    public void setBusinessLicenseId(String businessLicenseId) {
        this.businessLicenseId = businessLicenseId;
    }

    @Basic
    @Column(name = "legal_representative")
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    @Basic
    @Column(name = "company_phone")
    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Basic
    @Column(name = "mailbox")
    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    @Basic
    @Column(name = "company_size")
    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    @Basic
    @Column(name = "industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "audit_state")
    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    @Basic
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "balance")
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "create_time")
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoCompanyEntity that = (CoCompanyEntity) o;
        return state == that.state &&
                Double.compare(that.balance, balance) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(managerId, that.managerId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(renewalDate, that.renewalDate) &&
                Objects.equals(expirationDate, that.expirationDate) &&
                Objects.equals(companyArea, that.companyArea) &&
                Objects.equals(companyAddress, that.companyAddress) &&
                Objects.equals(businessLicenseId, that.businessLicenseId) &&
                Objects.equals(legalRepresentative, that.legalRepresentative) &&
                Objects.equals(companyPhone, that.companyPhone) &&
                Objects.equals(mailbox, that.mailbox) &&
                Objects.equals(companySize, that.companySize) &&
                Objects.equals(industry, that.industry) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(auditState, that.auditState) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, managerId, version, renewalDate, expirationDate, companyArea, companyAddress, businessLicenseId, legalRepresentative, companyPhone, mailbox, companySize, industry, remarks, auditState, state, balance, createTime);
    }

    @Override
    public String toString() {
        return "CoCompanyEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", managerId='" + managerId + '\'' +
                ", version='" + version + '\'' +
                ", renewalDate=" + renewalDate +
                ", expirationDate=" + expirationDate +
                ", companyArea='" + companyArea + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", businessLicenseId='" + businessLicenseId + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", companySize='" + companySize + '\'' +
                ", industry='" + industry + '\'' +
                ", remarks='" + remarks + '\'' +
                ", auditState='" + auditState + '\'' +
                ", state=" + state +
                ", balance=" + balance +
                ", createTime=" + createTime +
                '}';
    }
}
