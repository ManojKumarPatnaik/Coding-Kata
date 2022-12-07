package com.epam.coding.kata.exception;

public class StudentNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String exception) {
		super(exception);
	}
}
