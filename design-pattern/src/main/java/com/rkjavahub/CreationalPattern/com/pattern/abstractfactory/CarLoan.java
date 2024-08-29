/**
 *
 */
package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

/**
 * @author Rohit
 *
 */
public class CarLoan extends Loan {

    @Override
    double getInterestRate() {
        return 10.0;
    }

}
