package com.rkjavahub.lambda_expression;

interface Interf3 {
    int squareIt(int a);
}

// Traditional approach we need to create class to implement method in interface
class Demo3 implements Interf3 {
    @Override
    public int squareIt(int a) {
        return +a * a;
    }
}

public class TestCase4_IntMethodWithIntArgument {

    public static void main(String[] args) {
        // Calling sqroot() by using traditional approach (Till java 1.7)
        Interf3 i = new Demo3();
        System.out.println("Square of number using traditional approach is " + i.squareIt(4));

        // Calling m1() by using lambda expression (Java 1.8)
        Interf3 i3 = (a) -> {
            return (a * a);
        };
        System.out.println("Square of number using lambda expression is " + i3.squareIt(7));
    }
}
