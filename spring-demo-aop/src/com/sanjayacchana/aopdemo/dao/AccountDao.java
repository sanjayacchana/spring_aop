package com.sanjayacchana.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	
	public void addAccount() {
		System.out.println(getClass() + ": Doing MY DB Work: Adding an Account");
	}

}
