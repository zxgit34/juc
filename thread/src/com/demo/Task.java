package com.demo;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("task thread running");
    }
}
