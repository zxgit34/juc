package com.demo.state;

public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        Thread.sleep(50);
        System.out.println("t state: " + t.getState());
    }
}
