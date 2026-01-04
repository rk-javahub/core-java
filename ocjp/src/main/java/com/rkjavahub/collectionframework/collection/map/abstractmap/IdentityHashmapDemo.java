package com.rkjavahub.collectionframework.collection.map.abstractmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        Integer i1 = 10;
        Integer i2 = 10;
        hm.put(i1, "A");
        hm.put(i2, "B");

        System.out.println(hm);


        IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
        Integer i3 = 10;
        Integer i4 = 10;
        ihm.put(i3, "A");
        ihm.put(i4, "B");

        System.out.println(ihm);

    }

}
