/*Program to open notepad*/
package com.rkjavahub.Basic.com.basic.demo;

import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad");
	}
}
