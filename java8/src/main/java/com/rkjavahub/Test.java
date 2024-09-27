package com.rkjavahub;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        List ls= Arrays.asList("Rohit","Sachin","Raju","Rohan","Rahul");

        ls.stream().forEach(System.out::println);
    }

}
