package com.sacral.lic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EndorsementSummaryGeneration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String policyNo;
	private String schemeType;
	private String mphName;
	private String mphCode;
	private String policyStatus;
	
	public EndorsementSummaryGeneration() {
		
	}
	
	public EndorsementSummaryGeneration(String policyNo, String schemeType, String mphName, String mphCode, String policyStatus) {
		this.policyNo = policyNo;
		this.schemeType = schemeType;
		this.mphName = mphName;
		this.mphCode = mphCode;
		this.policyStatus = policyStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getSchemeType() {
		return schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public String getMphName() {
		return mphName;
	}

	public void setMphName(String mphName) {
		this.mphName = mphName;
	}

	public String getMphCode() {
		return mphCode;
	}

	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	
	
}