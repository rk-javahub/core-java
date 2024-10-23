/**
 *
 */
package com.rkjavahub.creational.abstractfactory;

/**
 * @author Rohit
 *
 */
public abstract class AbstractFactory {
    public abstract Account getAccount(String accountType);

    public abstract Loan getLoan(String loanType);

}
