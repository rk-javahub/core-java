package com.rkjavahub.exception_handling;

/*We can use throw keyword only for throwable type otherwise we will get compile time error saying incompatible type.*/

public class throwTestCase3 extends RuntimeException {
	public static void main(String[] args) {
		throw new throwTestCase3();
	}
}
