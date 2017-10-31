package com.assignment_4.superclasses;

import java.util.UUID;

import com.assingnment_4.interfaces.BankOperations;

/**
 * 
 * @author jasmin Amir
 * @version 1.0
 * This is my superclass BankAccount that implements the interface BankOperations
 *
 */

public class BankAccount implements BankOperations {
	/**
	 * Attributes
	 */
	
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	/**
	 * Constructor method
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	/**
	 * getter
	 * @return account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * setter
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * getter
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * setter
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * getter
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * setter
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Method to withdraw money
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value!");
		}
	}

	/**
	 * Method to deposit money
	 */
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative value");
		}

	}

	/**
	 * Method toString, to convert numbers to String.
	 * Prints out the customer accounts.
	 * @return string
	 */
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]";
	}
}
