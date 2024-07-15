/*Pattern program 3*/
package com.rkjavahub.Pattern.com.pattern.NumberPattern;

public class PatternProgram3 {
	public static void main(String[] args) {
		int r, c;
		for (r = 1; r <= 10; r++) {
			for (c = 1; c <= 10 - r; c++) {
				System.out.print(c + " ");
			}
			System.out.println("");
		}
	}
}

