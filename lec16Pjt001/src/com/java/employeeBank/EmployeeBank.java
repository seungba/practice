package com.java.employeeBank;

public class EmployeeBank {

	String name;
	static int amount = 0; // static 키워드는 객체간에 데이터를 공유할 수 있다.
	
	
	public EmployeeBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		
		amount += money;
		System.out.println("amount : " + amount);
		
	}
	
	public void spendMoney(int money) {
		
		amount -= money;
		System.out.println("amount : " + amount);
		
	}
	
	public void getBankInfo() {
		
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
		
	}
	
}
