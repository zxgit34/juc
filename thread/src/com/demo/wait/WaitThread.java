package com.demo.wait;

public class WaitThread implements Runnable {
    private String lock;

    public WaitThread(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("WaitThread synchronized begin");
            try {
                System.out.println("WaitThread wait begin");
                lock.wait();
                System.out.println("WaitThread wait end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("WaitThread synchronized end");
    }
}
