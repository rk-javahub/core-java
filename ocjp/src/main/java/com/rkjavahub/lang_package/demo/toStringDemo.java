package com.rkjavahub.lang_package.demo;

public class toStringDemo {
	int i;

	toStringDemo(int i) {
		this.i = i;
	}

	/*
	 * @Override public String toString() { return i + ""; }
	 */

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	public static void main(String[] args) {
		toStringDemo td = new toStringDemo(10);
		System.out.println(td);

	}

}
