/**
 *
 */
package com.rkjavahub.creational.abstractfactory;

/**
 * @author Rohit
 *
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("Account")) {
            return new AccountFactory();
        } else if (choice.equals("Loan")) {
            return new LoanFactory();
        } else
            return null;
    }
}
