package com.core.concepts.newfeatures.thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenNumByCompletableFuture {

    private static final Object object = new Object();

    private static IntPredicate evenPredicate = e -> e % 2 == 0;
    private static IntPredicate oddPredicate = e -> e % 2 != 0;

    private static void execute(int i) {
        synchronized (object) {
            try {
                System.out.println("Thread Name :: " + Thread.currentThread().getName() + ", counter :: " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void printResult(IntPredicate intPredicate) {
        IntStream.rangeClosed(1, 10)
                .filter(intPredicate)
                .forEach(OddEvenNumByCompletableFuture::execute);

    }
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync( () -> OddEvenNumByCompletableFuture.printResult(oddPredicate));
        CompletableFuture.runAsync( () -> OddEvenNumByCompletableFuture.printResult(evenPredicate));
        Thread.sleep(1000);
    }
}
