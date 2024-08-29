package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

/*Class responsible to return instance.*/
public class AccountFactory extends AbstractFactory {
    static Account account = null;

    @Override
    public Account getAccount(String accountType) {
        if (accountType.equals(null)) {
            return null;
        } else if (accountType.equals("Saving")) {
            account = new SavingAccount();
        } else if (accountType.equals("Current")) {
            account = new CurrentAccount();
        } else
            account = new SalaryAccount();
        return account;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
