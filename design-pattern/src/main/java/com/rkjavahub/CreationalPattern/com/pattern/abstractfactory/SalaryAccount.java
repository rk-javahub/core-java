package com.rkjavahub.CreationalPattern.com.pattern.abstractfactory;

public class SalaryAccount implements Account {

	@Override
	public void fillForm() {
		System.out.println("Filling Salary Account Form");
	}

	@Override
	public void checkDocuments() {
		System.out.println("Documents Submitted for Salary account opening.");
	}

}
