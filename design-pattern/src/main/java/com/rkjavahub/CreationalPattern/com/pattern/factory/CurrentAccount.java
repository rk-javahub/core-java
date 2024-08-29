package com.rkjavahub.CreationalPattern.com.pattern.factory;

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
