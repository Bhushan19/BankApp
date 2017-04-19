package com.capgemini.beans;

import com.capgemini.accountenum.AccountType;

public abstract class Account {
	private int accountNumber;
	
	public abstract int getAmount();
	public abstract void setAmount(int amount);
	public abstract AccountType getType();
	public abstract void setType(AccountType amount);
	
	public int getAccountnumber() {
		return accountNumber;
	}
	public void setAccountnumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}
}
