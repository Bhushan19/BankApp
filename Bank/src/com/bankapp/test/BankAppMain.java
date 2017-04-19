package com.bankapp.test;

import com.bankapp.test.accountenum.AccountType;
import com.bankapp.test.beans.Account;
import com.bankapp.test.beans.SavingAccount;
import com.bankapp.test.exception.BankAppException;
import com.bankapp.test.service.AccountService;
import com.bankapp.test.service.AccountServiceImpl;

public class BankAppMain {

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		Account account = new SavingAccount();
		account.setAccountnumber(12345);
		account.setAmount(1000);
		account.setType(AccountType.SAVING);
		
		Account accountc = new SavingAccount();
		accountc.setAccountnumber(6789);
		accountc.setAmount(1000);
		accountc.setType(AccountType.CURRENT);
		try {
			service.createAccount(account);
			service.createAccount(accountc);
			
			Account acc = service.fetchAccount(12345);
			System.out.println("found account with accountNumber:12345, type:"+acc.getType());
		} catch (BankAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
