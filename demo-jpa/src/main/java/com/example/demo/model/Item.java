package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item implements Serializable {
	private static final long serialVersionUID = 5620871486302619045L;
	@Id
	private long itemcode;
	private String itemdesc;
	private String createddate;
	private int auditId;

	public Item() {
		super();
	}

	public Item(long itemcode, String itemdesc, String createddate, int auditId) {
		super();
		this.itemcode = itemcode;
		this.itemdesc = itemdesc;
		this.createddate = createddate;
		this.auditId = auditId;
	}

	public long getItemcode() {
		return itemcode;
	}

	public void setItemcode(long itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemdesc() {
		return itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
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