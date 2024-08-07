package com.rkjavahub.generics;

/*
Here GenericClassExtends will support only values of type which extends Number class like Integer,Float,Double etc.
If we try to provide any other type like String we will get error
 */

public class GenericClassExtends<T extends Number> {
    private final T value;

    public GenericClassExtends(T name) {
        this.value = name;
    }

    public T getValue() {
        return value;
    }
}

class TestGenericClassExtends {
    public static void main(String[] args) {
        // GenericClassExtends<String> genericClassExtends=new GenericClassExtends<String>("Rohit");
        // We get exception since Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'

        GenericClassExtends<Integer> genericClassExtends = new GenericClassExtends<Integer>(7);
        System.out.println(genericClassExtends.getValue());

    }
}
