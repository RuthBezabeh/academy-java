package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class Main {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000, "43589");
		try {
			myAccount.withdraw(200);
			myAccount.withdraw(600);

			myAccount.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient funds. You need $" + e.getAmount() + " more to complete the transaction");
		}
	}

}
