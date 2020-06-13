package com.demo.state;

public class NewState {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("new Thread state: " + t.getState());
    }
}
