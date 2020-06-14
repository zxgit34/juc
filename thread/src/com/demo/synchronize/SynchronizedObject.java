package com.demo.synchronize;

import java.util.concurrent.TimeUnit;

public class SynchronizedObject {
    public synchronized void test1() {
        System.out.println("test1 begin");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1 end");
    }

    public synchronized void test2() {
        System.out.println("test2 begin");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2 end");
    }

    public synchronized void test3() {
        System.out.println("test3 begin");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test3 end");
    }
}
