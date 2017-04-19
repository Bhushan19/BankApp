package com.capgemini.accountenum;

public enum ErrorCodes {
	DUPLICATE_ACCOUNT(100),
	NOT_FOUND(101),
	INSUFFICIENT_BALANCE_AMOUNT(102),
	INVALID_AMOUNT(103);

    private final int value;

    ErrorCodes(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
	
}
