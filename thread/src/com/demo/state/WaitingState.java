package com.demo.state;

import java.util.concurrent.locks.ReentrantLock;

public class WaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();

        Thread.sleep(50);

        System.out.println("t state: " +t.getState());

        ReentrantLock lock = new ReentrantLock();
        Runnable runnable = new WaitingThread(lock);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t2.start();
        t3.start();

        Thread.sleep(50);

        System.out.println("t2 state: " +t2.getState());
        System.out.println("t3 state: " +t3.getState());
    }
}
