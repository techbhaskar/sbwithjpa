package com.example.demo.exception;

import java.io.Serializable;

public class DistributorNotFoundException extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;

	public DistributorNotFoundException(int itemcode) {
		super(String.format("Distributor is not found with id : '%s'", itemcode));
	}
}