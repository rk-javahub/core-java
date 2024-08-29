package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type of account you want to open in bank");
        String account = sc.next();

        AccountFactory accountFactory = (AccountFactory) FactoryCreator.getFactory("Account");
        Account account1 = accountFactory.getAccount(account);
        account1.fillForm();
        account1.checkDocuments();

        System.out.println("Enter type of a loan you want from bank");
        String loan = sc.next();

        LoanFactory loanFactory = (LoanFactory) FactoryCreator.getFactory("Loan");

        Loan loan1 = loanFactory.getLoan(loan);

        double interestRate = loan1.getInterestRate();

        System.out.println("Enter loan amount");
        double loan_amount = sc.nextDouble();

        System.out.println("Enter loan period");
        int period = sc.nextInt();

        loan1.calculateLoanPayment(loan_amount, period, interestRate);

    }
}
