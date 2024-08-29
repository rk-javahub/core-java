package com.rkjavahub.foreach;

import java.util.Arrays;
import java.util.List;

public class forEachDemo {
    public static void main(String[] args) {
        char[] chaarray = {'a', 'b', 'c', 'd', 'e'};
        List<String> arrayData = List.of(Arrays.toString(chaarray));

        arrayData.forEach(data -> System.out.println(data.toUpperCase()));

    }
}
