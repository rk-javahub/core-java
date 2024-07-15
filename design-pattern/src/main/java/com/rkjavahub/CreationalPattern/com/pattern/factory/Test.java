package com.rkjavahub.CreationalPattern.com.pattern.factory;

public class Test {

	public static void main(String[] args) {
		AccountFactory accountFactory=new AccountFactory();
		Account account=accountFactory.createAccount("Saving");
		account.fillForm();
		account.checkDocuments();
	}
}
