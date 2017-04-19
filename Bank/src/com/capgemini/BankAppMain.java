package com.capgemini;

import com.capgemini.accountenum.AccountType;
import com.capgemini.beans.Account;
import com.capgemini.beans.SavingAccount;
import com.capgemini.exception.BankAppException;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

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
