package com.demo.interrupt;

import java.util.concurrent.TimeUnit;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        InterruptThread interruptThread = new InterruptThread();
        Thread t = new Thread(interruptThread, "interruptThread");
        t.start();

        t.interrupt();
        System.out.println("t isInterrupted: " + t.isInterrupted());
        interruptThread.setInterruptedFlag(true);

        TimeUnit.SECONDS.sleep(1);
        System.out.println("t isInterrupted: " + t.isInterrupted());
    }
}
