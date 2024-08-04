package com.rkjavahub.generics;

public class GenericsClass<T> {
    private T value;

    public GenericsClass(T name) {
        this.value = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Test {
    public static void main(String[] args) {
        GenericsClass stringGenericsClass = new GenericsClass("Rohit");
        System.out.println(stringGenericsClass.getValue());

        GenericsClass integerGenericsClass = new GenericsClass(7);
        System.out.println(integerGenericsClass.getValue());



    }
}

