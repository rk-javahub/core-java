package com.rkjavahub.dsa.stack;

public class Stack<T extends Object> {
    int size;
    int top;
    T[] stackarray;

    /**
     * Constructor to initialize stack with variable such as size, top and
     * stackarray. stackarray is an array used to store stack elements. top
     * specifies index of an stack element.
     *
     * @param User Specifies stack size.
     */
    @SuppressWarnings("unchecked")
    Stack(int size) {
        this.size = size;
        top = -1;
        stackarray = (T[]) new Object[size];
    }

    /**
     * Method to double stack size.
     *
     * @return new stack size
     */
    @SuppressWarnings("unchecked")
    int incrmentCapacity() {
        System.out.println("Stack capacity incremented by double..");
        T[] stackarray1 = (T[]) new Object[size * 2];

        for (int i = 0; i < stackarray.length; i++) {
            stackarray1[i] = stackarray[i];
            top = i;
        }
        size = stackarray1.length;
        stackarray = stackarray1;
        return size;
    }

    /**
     * Method to push object into stack.
     *
     * @param num Object to be inserted in stack.
     * @return Inserted object.
     */
    public T push(T num) {
        if (top == size - 1) {
            incrmentCapacity();
            top++;
            stackarray[top] = num;
            return num;
        }
        top++;
        stackarray[top] = num;
        return num;
    }

    /**
     * Method t delete element from stack.
     *
     * @return top
     */
    public T pop() {
        T topnum = stackarray[top];
        top--;
        return topnum;
    }

    /**
     * @return top element
     */
    public T peek() {
        return stackarray[top];
    }

    /**
     * @return true if stack is empty.
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * @return true if stack is full.
     */
    public boolean isFull() {
        return (top == size - 1);
    }

    /*
     * public int search(int num) { for (T i : stackarray) { if (stackarray[i] ==
     * num) { return (i - 1); } } return -1; }
     */

    /**
     * @return stack size
     */
    public int checkStackSize() {
        return stackarray.length;
    }

    /**
     * Display all stack elements.
     */
    public void displayStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackarray[i] + " ");
        }
    }

}
