/*Pattern program 2*/
package com.rkjavahub.patterns.numberPattern;

public class PatternProgram2 {
	public static void main(String[] args) {
		int r, c;
		for (r = 1; r <= 10; r++) {
			for (c = 1; c <= r; c++) {

				System.out.print(c + " ");
			}
			System.out.println("");
		}
	}
}
