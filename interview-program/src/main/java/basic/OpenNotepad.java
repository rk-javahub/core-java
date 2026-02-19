/*Program to open notepad*/
package basic;

import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad");
	}
}
