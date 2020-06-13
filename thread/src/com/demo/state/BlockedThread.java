package com.demo.state;

public class BlockedThread implements Runnable {
    private Object lock;

    public BlockedThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("BlockedThread begin");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("BlockedThread end");
        }
    }
}
