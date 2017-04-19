package com.bankapp.test.service;

import com.bankapp.test.beans.Account;
import com.bankapp.test.exception.BankAppException;
import com.bankapp.test.repository.AccountRepository;

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
