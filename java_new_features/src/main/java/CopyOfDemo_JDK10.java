import java.util.ArrayList;
import java.util.List;

/**
 * 1.List.copyOf (JDK 10)
 * Returns an unmodifiable List containing the elements of the given Collection
 * 2.
 */

public class CopyOfDemo_JDK10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rohit");
        names.add("Akshay");

        List<String> copyOfnames = List.copyOf(names);

        copyOfnames.add("Sachin"); // It will throw UnsupportedOperationException because
    }
}
