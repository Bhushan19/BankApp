package com.bankapp.test.repository;

import java.util.Map;

import com.bankapp.test.accountenum.ErrorCodes;
import com.bankapp.test.beans.Account;
import com.bankapp.test.exception.BankAppException;

public class AccountRepository {
	private AccountRepositoryData data = AccountRepositoryData.getInstance();
	
	public boolean createAccount(Account account) throws BankAppException {
		boolean status = true;
		Map<Integer,Account> accountdata = data.getAccountData();
		if(account.getAmount() < 500) {
			throw new BankAppException(ErrorCodes.INSUFFICIENT_BALANCE_AMOUNT.getValue(), "For account opening, minium amount should be greater than 500.");
		}
		if(!accountdata.containsKey(account.getAccountnumber())) {
			accountdata.put(account.getAccountnumber(), account);
		} else {
			status = false;
			throw new BankAppException(ErrorCodes.DUPLICATE_ACCOUNT.getValue(),"Provided account already exist.");
		}
		return status;
	}

	public Account fetchAccount(int accountNumber) throws BankAppException {
		Map<Integer,Account> accountdata = data.getAccountData();
		Account account = null;
		if(accountdata.containsKey(accountNumber)) {
			account = accountdata.get(accountNumber);
		} else {
			throw new BankAppException(ErrorCodes.NOT_FOUND.getValue(),"Provided account not exist.");
		}
		return account;
	}

	public boolean updateAccount(int accountNumber, int amount) throws BankAppException {
		boolean status = true;
		if(amount<0) {
			throw new BankAppException(ErrorCodes.INVALID_AMOUNT.getValue(),"Amount should not negative.");
		}
		Account account = fetchAccount(accountNumber);
		if(null != account) {
			account.setAmount(amount);
		} else {
			status = false;
		}
		return status;
	}

	@SuppressWarnings("unused")
	public boolean deleteAccount(int accountNumber) throws BankAppException {
		boolean status = true;
		Account account = null;
		Map<Integer,Account> accountdata = data.getAccountData();
		if(accountdata.containsKey(accountNumber)) {
			account = accountdata.get(accountNumber);
			accountdata.remove(accountNumber);
			account=null;
		} else {
			throw new BankAppException(ErrorCodes.NOT_FOUND.getValue(),"Provided account not exist.");
		}
		return status;
	}

}
