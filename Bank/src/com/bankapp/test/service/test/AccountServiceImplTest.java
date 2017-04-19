package com.bankapp.test.service.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bankapp.test.accountenum.AccountType;
import com.bankapp.test.beans.Account;
import com.bankapp.test.beans.SavingAccount;
import com.bankapp.test.exception.BankAppException;
import com.bankapp.test.service.AccountServiceImpl;

public class AccountServiceImplTest {
	private AccountServiceImpl serviceImpl;
	private Account account;
	private Account accountc;

	@Before
	public void setUp() throws Exception {
		serviceImpl = new AccountServiceImpl();
		account = new SavingAccount();
		account.setAccountnumber(123456);
		account.setAmount(1000);
		account.setType(AccountType.SAVING);
		
		accountc = new SavingAccount();
		accountc.setAccountnumber(67890);
		accountc.setAmount(1000);
		accountc.setType(AccountType.CURRENT);
	}

	@After
	public void tearDown() throws Exception {
		serviceImpl = null;
		account = null;
		accountc = null;
	}

	@Test
	public void createAccountTest() throws BankAppException {
		Assert.assertTrue(serviceImpl.createAccount(accountc));
	}
	
	@Test(expected=BankAppException.class)
	public void createAccountDuplicateExceptionTest() throws BankAppException {
		serviceImpl.createAccount(account);
		serviceImpl.createAccount(account);
	}

	@Test
	public void fetchAccountTest() throws BankAppException {
		serviceImpl.createAccount(account);
		Assert.assertEquals(account,serviceImpl.fetchAccount(123456));
	}
	
	@Test(expected=BankAppException.class)
	public void fetchAccountExceptionTest() throws BankAppException {
		Assert.assertEquals(account,serviceImpl.fetchAccount(123456));
	}
	
}
