package com.rkjavahub;
/*
Local Variable Type Inference (var)
Instead of explicitly declaring type, you can use var:
var name = "Rohit";   // String
var count = 10;       // int
✅ Rules:
Works only for local variables
Type is inferred at compile time (not dynamic like JavaScript)

 */
public class VarDemo_JDK10 {
    public static void main(String[] args) {
        var name="Rohit";
        System.out.println("Hello "+name);
    }
}
