package com.bankapp.test.service;

import com.bankapp.test.beans.Account;
import com.bankapp.test.exception.BankAppException;

public interface AccountService {
	public boolean createAccount(Account account) throws BankAppException;
	public Account fetchAccount(int accountNumber) throws BankAppException;
	public boolean updateAccount(int accountNumber,int amount) throws BankAppException;
	public boolean deleteAccount(int accountNumber) throws BankAppException;
}
