package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distributor")
public class Distributor implements Serializable {
	private static final long serialVersionUID = -8700450758690513940L;
	@Id
	private long distributorcode;
	private String distributordesc;
	private String createddate;
	private int auditId;

	public Distributor() {
		super();
	}

	public Distributor(long distributorcode, String distributordesc, String createddate, int auditId) {
		super();
		this.distributorcode = distributorcode;
		this.distributordesc = distributordesc;
		this.createddate = createddate;
		this.auditId = auditId;
	}

	public long getDistributorcode() {
		return distributorcode;
	}

	public void setDistributorcode(long distributorcode) {
		this.distributorcode = distributorcode;
	}

	public String getDistributordesc() {
		return distributordesc;
	}

	public void setDistributordesc(String distributordesc) {
		this.distributordesc = distributordesc;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

}