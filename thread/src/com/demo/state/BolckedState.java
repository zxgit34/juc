package com.demo.state;

public class BolckedState {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        BlockedThread blockedThread = new BlockedThread(lock);
        Thread t1 = new Thread(blockedThread);
        t1.start();

        Thread t2 = new Thread(blockedThread);
        t2.start();


        Thread.sleep(50);
        System.out.println("t2 state: " + t2.getState());
    }

}
