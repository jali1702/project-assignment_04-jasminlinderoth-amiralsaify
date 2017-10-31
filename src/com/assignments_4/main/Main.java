package com.assignments_4.main;

import com.assignment_4.superclasses.*;
import com.assignment_4.subclasses.*;

/**
 * 
 * @author Jasmin and Amir
 * @version 1.0
 * My Main Class.
 */

public class Main {
	public static void main(String[] args) {
		String account = "";

		BankCustomer bankCustomer = new BankCustomer("Jasmin", 24);
		bankCustomer.addAccount(new BankAccount());
		bankCustomer.addAccount(new PersonalAccount());
		bankCustomer.addAccount(new SavingsAccount());
		System.out.println(bankCustomer.toString());

		account = bankCustomer.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account.");
		bankCustomer.depositToAccount(account, 30.0);
		System.out.println(bankCustomer.toString());

		System.out.println("Withdrawing 30.0 to the first account.");
		account = bankCustomer.getCustomerAccounts().get(1).getAccountNumber();
		bankCustomer.withdrawFromAccount(account, 200.0);
		System.out.println(bankCustomer.toString());

		System.out.println("Depositing 200.0 to the first account.");
		account = bankCustomer.getCustomerAccounts().get(2).getAccountNumber();
		bankCustomer.depositToAccount(account, 200.0);
		System.out.println(bankCustomer.toString());

	}
}
