package com.example.demo.exception;

import java.io.Serializable;

public class ItemNotFoundException extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException(int itemcode) {
		super(String.format("Item is not found with id : '%s'", itemcode));
	}
}