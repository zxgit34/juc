package com.demo.suspend;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 一个suspend挂起一个有锁的线程，那么在锁恢复之前将不会被释放。如果调用suspend的方法线程试图取得相同的锁，程序就会死锁
 */
public class SuspendDemo {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t = new Thread(new SuspendThread(lock));
        t.start();

        Thread.sleep(50);

        System.out.println("begin suspend SuspendThread");
        t.suspend();
        System.out.println("end suspend SuspendThread");

        System.out.println("begin main lock");
        lock.lock();
        System.out.println("end main lock");

        t.resume();
    }
}
