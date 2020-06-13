package com.demo.stop;

public class StopThread implements  Runnable {
    private Dto dto;

    public StopThread(Dto dto) {
        this.dto = dto;
    }

    @Override
    public void run() {
        dto.update("b", "2");
    }
}
