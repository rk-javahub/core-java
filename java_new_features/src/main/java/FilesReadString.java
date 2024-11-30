import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1.Files.readString()
 * Returns: a String containing the content read from the file
 */

public class FilesReadString {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\JAVA\\rk-javahub GitHub\\core-java\\java_new_features\\src\\main\\resources\\demo.txt");
        String str = Files.readString(path);
        System.out.println(str);
    }
}
