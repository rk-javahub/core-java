package com.rkjavahub.stream.stringoperation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromthestringandreturninthesameorder {
    public static void main(String[] args) {
        String str="aabbccddeeffggaiihh";

        Arrays.stream(str.split("")).collect(Collectors.toSet()).forEach(System.out::print);

    }



}
