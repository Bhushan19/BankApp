package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exception.BankAppException;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	private AccountRepository repository = new AccountRepository();
	
	@Override
	public boolean createAccount(Account account) throws BankAppException {
		return repository.createAccount(account);
	}

	@Override
	public Account fetchAccount(int accountNumber) throws BankAppException {
		return repository.fetchAccount(accountNumber);
	}

	@Override
	public boolean updateAccount(int accountNumber, int amount) throws BankAppException {
		return repository.updateAccount(accountNumber,amount);
	}

	@Override
	public boolean deleteAccount(int accountNumber) throws BankAppException {
		return repository.deleteAccount(accountNumber);
	}


}
