package com.demo.wait;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Thread t1 = new Thread(new WaitThread(lock));
        t1.start();

        Thread.sleep(50);

        Thread t2 = new Thread(new NotifyThread(lock));
        t2.start();

        Thread.sleep(1000);
    }
}
