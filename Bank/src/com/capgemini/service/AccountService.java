package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exception.BankAppException;

public interface AccountService {
	public boolean createAccount(Account account) throws BankAppException;
	public Account fetchAccount(int accountNumber) throws BankAppException;
	public boolean updateAccount(int accountNumber,int amount) throws BankAppException;
	public boolean deleteAccount(int accountNumber) throws BankAppException;
}
