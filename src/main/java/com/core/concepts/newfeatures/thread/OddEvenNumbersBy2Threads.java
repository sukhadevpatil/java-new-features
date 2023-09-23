package com.core.concepts.newfeatures.thread;

/**
 * this would work for Java 7
 */
public class OddEvenNumbersBy2Threads implements Runnable {

    private int count = 1;

    final Object object;

    public OddEvenNumbersBy2Threads(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new OddEvenNumbersBy2Threads(lock);
        Runnable r2 = new OddEvenNumbersBy2Threads(lock);

        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }


    @Override
    public void run() {
        while (count <= 10) {
            if(count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name :: " + Thread.currentThread().getName() + " & Counter :: " + count);
                    count++;

                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(count % 2 != 0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object) {
                    System.out.println("Thread Name :: " + Thread.currentThread().getName() + " & Counter :: " + count);
                    count++;

                    object.notify();
                }
            }
        }
    }
}
