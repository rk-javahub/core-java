package com.rkjavahub.dsa.stack;
/*
Program to travers through the Stack
*/

import java.util.Stack;

public class StackTraversal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        getStackElement(stack);

    }

    private static void getStackElement(Stack stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

}
