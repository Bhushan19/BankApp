package com.bankapp.test.exception;

public class BankAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int errorCode;
	@SuppressWarnings("unused")
	private String errorMessage;
	
	public BankAppException() {
		
	}
	
	public BankAppException(int errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}

}
