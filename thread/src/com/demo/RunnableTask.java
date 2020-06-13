package com.demo;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("task thread running");
    }
}
