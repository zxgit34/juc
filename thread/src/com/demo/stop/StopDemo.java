package com.demo.stop;

import java.util.concurrent.TimeUnit;

public class StopDemo {
    public static void main(String[] args) throws InterruptedException {
        Dto dto = new Dto();
        Thread t = new Thread(new StopThread(dto));
        t.start();

        Thread.sleep(50);

        t.stop();

        TimeUnit.SECONDS.sleep(1);

        dto.print();

        dto.wait();
    }

}
