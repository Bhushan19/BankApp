package com.capgemini.beans;

import com.capgemini.accountenum.AccountType;

public class CurrentAccount extends Account {

	private int amount;
	private AccountType accountType;
	
	@Override
	public int getAmount() {
		return amount;
	}
	@Override
	public void setAmount(int amount) {
		this.amount=amount;
	}
	@Override
	public AccountType getType() {
		return accountType;
	}
	@Override
	public void setType(AccountType accountType) {
		this.accountType = accountType;
		
	}

}
