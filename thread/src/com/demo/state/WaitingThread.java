package com.demo.state;

import java.util.concurrent.locks.ReentrantLock;

public class WaitingThread implements Runnable {
    private ReentrantLock lock;
    public WaitingThread(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        while (true) {

        }
    }
}
