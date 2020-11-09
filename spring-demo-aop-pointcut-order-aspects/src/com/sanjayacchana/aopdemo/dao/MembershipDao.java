package com.sanjayacchana.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
	
	public void addMembershipAccount() {
		System.out.println(getClass() +": Adding Membership DAO");
	}

}
