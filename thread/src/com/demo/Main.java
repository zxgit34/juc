package com.demo;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableTask());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        System.out.println("main thread finish");
    }
}
