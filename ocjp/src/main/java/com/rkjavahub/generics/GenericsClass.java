package com.rkjavahub.generics;

public class GenericsClass<T> {
    private final T value;

    public GenericsClass(T name) {
        this.value = name;
    }

    public T getValue() {
        return value;
    }
}

class TestGenericsClass {
    public static void main(String[] args) {
        GenericsClass<String> stringGenericsClass = new GenericsClass<String>("Rohit");
        System.out.println(stringGenericsClass.getValue());

        GenericsClass<Integer> integerGenericsClass = new GenericsClass<Integer>(7);
        System.out.println(integerGenericsClass.getValue());


    }
}

