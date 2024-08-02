package com.rkjavahub.lambda_expression;

interface Factorial {
    int calculateFactorial(int num);
}


public class TestCase10_BlockLambdaExpression {
    public static void main(String[] args) {

        Factorial factorial = (int a) -> {
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            return fact;
        };

        System.out.println(factorial.calculateFactorial(5));
    }
}
