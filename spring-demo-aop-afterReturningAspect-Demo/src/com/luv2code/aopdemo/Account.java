package com.luv2code.aopdemo;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String name;
	private String level;
	
	public Account() {
		
	}
	
	public Account(String name, String level) {
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + "]";
	}
	
	public List<Account> findAccounts(){
		List<Account> list = new ArrayList<Account>();
		Account temp = new Account("man","platinum");
		
				
		return list;
	}
	
	
}
