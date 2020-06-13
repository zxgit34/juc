package com.demo.interrupt;

public class InterruptThread implements Runnable {
    private volatile boolean interruptedFlag = false;

    @Override
    public void run() {
        boolean checkInterrupted = true;
        while (checkInterrupted) {
            while (interruptedFlag) {
                System.out.println("InterruptThread interrupted: " + Thread.interrupted());
                checkInterrupted = false;
                break;
            }
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setInterruptedFlag(boolean interruptedFlag) {
        this.interruptedFlag = interruptedFlag;
    }
}

