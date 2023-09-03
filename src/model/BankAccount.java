package model;

public class BankAccount {
	
	private double balance;
	
	/**
	 * Default constructor
	 * must have an initial deposit to create a BankAccount object
	 * @param d //initial deposit amount which will be set to the balance
	 */
	public BankAccount(double d) {
		this.balance = d;
	}
	
	//////////getters//////////
	public double getBalance() {
		return balance;
	}
	///////setters/////////////
	/*
	 * Notice there is no setBalance()
	 */
	
	public double deposit(double d) {
		return balance+=d;
		
	}
	
	public double withdraw(double d) {
		return balance-=d;
		
	}
	
}
