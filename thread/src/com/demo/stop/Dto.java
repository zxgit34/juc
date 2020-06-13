package com.demo.stop;

import java.util.concurrent.TimeUnit;

public class Dto {
    private String name = "a";
    private String password = "1";

    synchronized public void update(String name, String password) {
        this.name = name;

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.password = password;
    }

    synchronized public void print() {
        System.out.println("dto is name: " + this.name + " password: " + this.password);
    }
}
