package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ItemDistributor")
public class ItemDistributor implements Serializable {
	private static final long serialVersionUID = 5543731134429150042L;
	@Id
	private long itemcode;
	private long distributorcode;

	public ItemDistributor() {
		super();
	}

	public ItemDistributor(long itemcode, long distributorcode) {
		super();
		this.itemcode = itemcode;
		this.distributorcode = distributorcode;
	}

	/**
	 * @return the itemcode
	 */
	public long getItemcode() {
		return itemcode;
	}

	/**
	 * @param itemcode the itemcode to set
	 */
	public void setItemcode(long itemcode) {
		this.itemcode = itemcode;
	}

	/**
	 * @return the distributorcode
	 */
	public long getDistributorcode() {
		return distributorcode;
	}

	/**
	 * @param distributorcode the distributorcode to set
	 */
	public void setDistributorcode(long distributorcode) {
		this.distributorcode = distributorcode;
	}

}