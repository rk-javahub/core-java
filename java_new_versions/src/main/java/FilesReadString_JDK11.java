package src.main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1.Files.readString()  (JDK11)
 * Returns: a String containing the content read from the file
 * 2.Files.writeString() (JDK11)
 * Write a CharSequence to a file
 */

public class FilesReadString_JDK11 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\JAVA\\rk-javahub GitHub\\core-java\\java_new_features\\src\\main\\resources\\demo.txt");
        String str = Files.readString(path);
        System.out.println(str);
        Path newPath = Paths.get("F:\\JAVA\\rk-javahub GitHub\\core-java\\java_new_features\\src\\main\\resources\\demo1.txt");
        Files.writeString(newPath, str);
    }
}
