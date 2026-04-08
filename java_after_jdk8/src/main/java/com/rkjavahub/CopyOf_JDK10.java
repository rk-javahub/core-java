package com.rkjavahub;
/*
Java 9 introduced List.of(), Set.of(), Map.of()
Java 10 improved it with:

👉 copyOf() methods

Creates immutable copy
Throws exception if modified
 */

import java.util.List;

public class CopyOf_JDK10 {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B");
        List<String> copy = List.copyOf(list);
        System.out.println(copy);

        copy.add("C");
        System.out.println(copy);
    }
}
