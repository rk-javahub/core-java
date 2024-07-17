package com.rkjavahub.declaration_and_access_modifier;

import java.util.logging.Logger;

public class volatile_demo {
	private static final Logger LOGGER = Logger.getAnonymousLogger();

	private static volatile int MY_INT = 0;

	public static void main(String[] args) {
		System.out.println(MY_INT);

	}

}
