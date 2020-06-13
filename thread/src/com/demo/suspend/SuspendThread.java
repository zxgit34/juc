package com.demo.suspend;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SuspendThread implements Runnable {
    private ReentrantLock lock;

    public SuspendThread(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("begin SuspendThread lock");
        lock.lock();
        System.out.println("end SuspendThread lock");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("begin SuspendThread unlock");
        lock.unlock();
        System.out.println("end SuspendThread unlock");
    }
}
