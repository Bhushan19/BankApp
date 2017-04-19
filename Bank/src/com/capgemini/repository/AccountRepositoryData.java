package com.capgemini.repository;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.beans.Account;

public class AccountRepositoryData {
	private static AccountRepositoryData instance;
	private Map<Integer,Account> accountData;
	public Map<Integer, Account> getAccountData() {
		if(accountData==null) {
			accountData=new HashMap<>();
		}
		return accountData;
	}
	public static AccountRepositoryData getInstance() {
		if(instance==null) {
			instance=new AccountRepositoryData();
		}
		return instance;
	}
	private AccountRepositoryData(){
	}

}
