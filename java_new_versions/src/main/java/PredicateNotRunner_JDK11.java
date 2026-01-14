package src.main.java;

import java.util.List;
import java.util.function.Predicate;

/**
 * 1.Predicate.not()  (JDK11)
 * Returns a predicate that is the negation of the supplied predicate.
 */
public class PredicateNotRunner_JDK11 {

    public static Boolean checkEven(Integer number) {
        return number % 2 == 0;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Odd Numbers in List are:");
        numbers.stream().filter(Predicate.not(PredicateNotRunner_JDK11::checkEven)).forEach(System.out::println);


    }
}
