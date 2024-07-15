package com.rkjavahub.CreationalPattern.com.pattern.factory;

/*Class responsible to return instance.*/
public class AccountFactory {
	static Account account;

	public Account createAccount(String accountType) {
		if (accountType.equals("Saving")) {
			account = new SavingAccount();
		} else if (accountType.equals("Current")) {
			account = new CurrentAccount();
		} else
			account = new SalaryAccount();
		return account;
	}
}
