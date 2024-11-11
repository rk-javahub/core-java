/**
 *
 */
package com.rkjavahub.supplier;

import java.util.function.Supplier;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Rohit";
        System.out.println(supplier.get());
    }
}
