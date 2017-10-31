package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * 
 * @author Jasmin and Amir
 * @version 1.0
 * This is my subclass BankCustomer that inherits Human.
 * 
 *
 */

public class BankCustomer extends Human {
	/**
	 * Constructor. super invokes the constructor 
	 * @param name - string name
	 * @param age - int age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * Instantiate ArrayList BankAccount
	 */
	public ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * 
	 * @return customerAccount
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * setter	 
	 * @param customerAccounts - the accounts of a customer
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * Getter
	 * @param BankCustomer - the bank customer
	 */
	public void getCustomerAccounts(ArrayList<BankAccount> BankCustomer) {

	}

	/**
	 * Adds an account to this bank
	 * @param bankAccount - customers bank account
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}

	/**
	 * deposits an amount of money to an specific account.
	 * @param accountNumber - account number
	 * @param amount - the amount of money
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}

		}
	}

	/**
	 * withdraws an amount of money to an specific account.
	 * @param accountNumber - the account number
	 * @param amount - amount of money
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}

		}
	}
/**
 * Prints age and name of customer to a string
 * @return String
 */
	public String toString() {
		String s = "";
		for (BankAccount customerAccount : customerAccounts) {
			s = s + (customerAccount.toString() + "\n");
		}
		return "Customer: " + getName() + " " + "Age: " + getAge() + "\n" + s;
	}

}
