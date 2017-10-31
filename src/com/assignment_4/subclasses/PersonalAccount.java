package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * 
 * @author jasmin and amir
 * @version 1.0
 * This is my subclass PersonalAccount that inherits BankAccount.
 *
 */

public class PersonalAccount extends BankAccount {
	/**
	 * Default Constructor
	 */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}
