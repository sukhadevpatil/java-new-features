package com.core.concepts.newfeatures.basics.failFastAndSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest extends Thread {

    // static Map<String, String> map = new HashMap<>(); // this will throw ConcurrentModificationException
    static Map<String, String> map = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put("4", "Four");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        ConcurrentHashMapTest hashMapTest = new ConcurrentHashMapTest();
        hashMapTest.start();

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

            Thread.sleep(1000);
        }
    }
}
