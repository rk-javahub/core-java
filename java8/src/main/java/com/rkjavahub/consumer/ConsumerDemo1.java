/**
 *
 */
package com.rkjavahub.consumer;

import java.util.function.Consumer;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class ConsumerDemo1 implements Consumer<Integer> {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (a) -> System.out.println("Printing : " + a);
        consumer.accept(10);
    }

    @Override
    public void accept(Integer a) {
        System.out.println("Printing : " + a);
    }

}
