package com.demo.wait;

public class NotifyThread implements Runnable {
    private String lock;

    public NotifyThread(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("NotifyThread synchronized begin");
            System.out.println("NotifyThread notify begin");
            lock.notify();
            System.out.println("NotifyThread notify end");
        }

        System.out.println("NotifyThread synchronized end");
    }
}
