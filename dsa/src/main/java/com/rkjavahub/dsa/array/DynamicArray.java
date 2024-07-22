package com.rkjavahub.dsa.array;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
