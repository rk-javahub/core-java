package com.rkjavahub.creational.factory;

public class Test {

    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account account = accountFactory.createAccount("Saving");
        account.fillForm();
        account.checkDocuments();
    }
}

