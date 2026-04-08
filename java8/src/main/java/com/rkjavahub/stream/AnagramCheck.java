package com.rkjavahub.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";


        boolean equals = Arrays.stream(s1.split(""))
                .sorted()
                .toList()
                .equals(
                        Arrays.stream(s2.split(""))
                                .sorted()
                                .collect(Collectors.toList())
                );

        if (equals) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }

    }
}
