package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * 
 * @author jasmin and amir
 * @value 1.0
 * My subclass SavingsAccount that inherits BankAccount.
 *
 */

public class SavingsAccount extends BankAccount {
	/**
	 * Default Constructor
	 */
	public SavingsAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
