package com.sacral.lic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

    @Id
    private Long id;

    private String policyNumber;
    private String policyType;
    private String policyHolder;
    private String insurer;
    private String status;
    private String criteria;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getPolicyNumber() {
	return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
	this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
	return policyType;
    }

    public void setPolicyType(String policyType) {
	this.policyType = policyType;
    }

    public String getPolicyHolder() {
	return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
	this.policyHolder = policyHolder;
    }

    public String getInsurer() {
	return insurer;
    }

    public void setInsurer(String insurer) {
	this.insurer = insurer;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public String getCriteria() {
	return criteria;
    }

    public void setCriteria(String criteria) {
	this.criteria = criteria;
    }

}

@Entity
@Table(name = "endorsement")
public class Endorsement {

    @Id
    private Long id;

    private Long policyId;
    private String maker;
    private String checker;
    private String status;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Long getPolicyId() {
	return policyId;
    }

    public void setPolicyId(Long policyId) {
	this.policyId = policyId;
    }

    public String getMaker() {
	return maker;
    }

    public void setMaker(String maker) {
	this.maker = maker;
    }

    public String getChecker() {
	return checker;
    }

    public void setChecker(String checker) {
	this.checker = checker;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

}