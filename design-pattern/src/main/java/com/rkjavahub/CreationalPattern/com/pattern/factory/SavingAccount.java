package com.rkjavahub.CreationalPattern.com.pattern.factory;

public class SavingAccount implements Account {

	@Override
	public void fillForm() {
		System.out.println("Filling Saving Account Form.");
	}

	@Override
	public void checkDocuments() {
		System.out.println("Documents Submitted for Saving account opening.");
	}

}
