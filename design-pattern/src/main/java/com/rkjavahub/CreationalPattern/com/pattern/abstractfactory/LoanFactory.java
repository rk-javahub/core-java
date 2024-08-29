/**
 *
 */
package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

/**
 * @author Rohit
 *
 */
public class LoanFactory extends AbstractFactory {
    Loan loan = null;

    @Override
    public Account getAccount(String accountType) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if (loanType.equals(null)) {
            return null;
        } else if (loanType.equals("Home")) {
            loan = new HomeLoan();
        } else if (loanType.equals("Car")) {
            loan = new CarLoan();
        } else
            loan = new PersonalLoan();
        return loan;
    }
}
