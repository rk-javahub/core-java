package com.rkjavahub;

public class Demo {
    public static void main(String[] args) {
        int number = 154;

        System.out.println("Number is " + checkArmstrong(number));


    }

    private static boolean checkArmstrong(int number) {
        int sum = 0, last = 0;
        int originalNumber=number;
        while (number > 0) {
            System.out.println("Hello");
            last = number % 10;
            sum = sum + (last * last * last);
            System.out.println("Sum is " + sum);
            number = number / 10;
        }
        return sum == originalNumber;
    }
}
