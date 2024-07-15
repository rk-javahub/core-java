/**
 * 
 */
package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

/**
 * @author Rohit
 *
 */
public abstract class Loan {

	abstract double getInterestRate();

	public void calculateLoanPayment(double loanAmount, int loan_period, double interestRate) {
		double EMI;
		int n;
		n = loan_period * 12;
		interestRate = interestRate / 1200;
		EMI = ((interestRate * Math.pow((1 + interestRate), n)) / ((Math.pow((1 + interestRate), n)) - 1)) * loanAmount;

		System.out.println("Your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
	}
}
