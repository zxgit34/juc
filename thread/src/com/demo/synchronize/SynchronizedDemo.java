package com.demo.synchronize;

import java.util.concurrent.TimeUnit;

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedObject object = new SynchronizedObject();
        SynchronizedObject object2 = new SynchronizedObject();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.test1();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.test2();
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                object2.test3();
            }
        });
        t3.start();

        TimeUnit.SECONDS.sleep(10);
    }
}
