package com.rkjavahub.dsa.stack;

public class Test {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(2);
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Push " + stack.push(7));
        System.out.println("Push " + stack.push(27));
        System.out.println("Stack size is: " + stack.size);
        System.out.print("Display stack elements: ");
        stack.displayStack();
        System.out.println("\nIs stack full: " + stack.isFull());
        System.out.println("Push " + stack.push(37));
        System.out.println("Push " + stack.push(47));
        System.out.print("Display stack elements: ");
        stack.displayStack();
        System.out.println("\nStack size is: " + stack.size);
        System.out.println("Return stack peek: " + stack.peek());
        System.out.println("Pop " + stack.pop());
        stack.displayStack();

    }

}
