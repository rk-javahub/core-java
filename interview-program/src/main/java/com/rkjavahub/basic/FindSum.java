package com.rkjavahub.basic;
/*
Calculation of n number using most optimized way
 */


public class FindSum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(calculateSumOfN(n));
    }

    private static int calculateSumOfN(int n) {
        return n * (n + 1) / 2;
    }
}
