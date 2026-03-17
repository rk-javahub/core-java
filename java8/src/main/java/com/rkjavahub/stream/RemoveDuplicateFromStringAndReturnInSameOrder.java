package com.rkjavahub.stream;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateFromStringAndReturnInSameOrder {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("1","Rohit");
        hm.put("1","Sachin");
        hm.put(new String("1"),"Pramod");

        System.out.println(hm.size());
        System.out.println(hm.get("1"));

    }
}
