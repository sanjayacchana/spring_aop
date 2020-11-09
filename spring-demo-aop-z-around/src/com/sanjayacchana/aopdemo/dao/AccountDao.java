package com.sanjayacchana.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sanjayacchana.aopdemo.Account;

@Component
public class AccountDao {
	
	private String name;
	
	private String serviceCode;
	
	
	public List<Account> findAccounts(boolean tripwire){
		
		if(tripwire) {
			throw new RuntimeException("NO soup for you...");
		}
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		//create sample accounts
		Account account1 = new Account("john", "silver");
		Account account2 = new Account("madhu", "platinum");
		Account account3 = new Account("luca", "gold");
		
		//add them  to our accounts list
		myAccounts.add(account1);
		myAccounts.add(account2);
		myAccounts.add(account3);
		
		return myAccounts;
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {
			System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		}

	public String getName() {
		System.out.println(getClass() + "in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + "in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + "in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
}
