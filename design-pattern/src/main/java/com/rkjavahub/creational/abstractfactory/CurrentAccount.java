package com.rkjavahub.creational.abstractfactory;

public class CurrentAccount implements Account {

    @Override
    public void fillForm() {
        System.out.println("Filling Current Account Form");
    }

    @Override
    public void checkDocuments() {
        System.out.println("Documents Submitted for Current Account opening.");
    }

}
