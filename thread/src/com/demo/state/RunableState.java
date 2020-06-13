package com.demo.state;

public class RunableState {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        System.out.println("Thread start state: " + t.getState());
    }
}
