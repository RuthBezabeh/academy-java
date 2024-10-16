package com.bptn.course._06_big_coding_challenges._week_3._big_coding_3_1;

//Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception {

	// Modify the constructor below to take a String message parameter.
	public OutOfStockException(String message) {
		// Call the superclass constructor passing the message parameter.
		super(message);
	}
}
