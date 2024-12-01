import java.util.Optional;

public class StringUtilChanges {
    public static void main(String[] args) {
        String str = null;
        System.out.println("  ".isBlank()); // true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println(" R K ".strip().replace(" ", "$")); // Returns a string whose value is this string, with all leading and trailing white space removed.
        System.out.println(" R K ".stripLeading().replace(" ", "$")); // Returns a string whose value is this string, with all leading white space removed.
        System.out.println(" R K ".stripTrailing().replace(" ", "$")); // Returns a string whose value is this string, with all trailing white space removed
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println); // Returns a stream of lines extracted from this string, separated by line terminators.
        System.out.println(Optional.of("ROHIT".transform(s -> s.substring(2)))); // This method allows the application of a function to this string. The function should expect a single String argument and produce an R result.
        System.out.printf("My name is %s. And my age is %d%n", "Rohit", 34);

    }
}
