/**
 *
 */
package com.rkjavahub.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit
 *
 */
public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(12);
        ls.add(4);
        ls.add(26);
        ls.add(89);
        ls.add(104);
        ls.add(75);

        System.out.print("maximum number in list is := ");
        int max = ls.stream().max(Integer::compareTo).get();
        System.out.println(max);

        System.out.print("Minimum number in list is := ");
        int min = ls.stream().min(Integer::compareTo).get();
        System.out.println(min);
    }
}
