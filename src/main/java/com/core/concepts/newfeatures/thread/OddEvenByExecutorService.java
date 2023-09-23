package com.core.concepts.newfeatures.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class OddEvenByExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1, 10)
                .forEach(num -> {
                    CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
                            .thenApplyAsync( val -> {
                                if(val % 2 != 0) {
                                    System.out.println("Thread Name :: " + Thread.currentThread().getName() + " Odd counter :: " + val);
                                }
                                return val;
                            }, executorService);
                    oddCompletableFuture.join();

                    CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                            .thenApplyAsync( val -> {
                                if(val % 2 == 0) {
                                    System.out.println("Thread Name :: " + Thread.currentThread().getName() + " Even counter :: " + val);
                                }
                                return val;
                            }, executorService);
                    evenCompletableFuture.join();
                });

        executorService.shutdown();
    }
}
