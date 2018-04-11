package com.bluzioo.incubator.javase.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BufferData {

    private char[] buffer = new char[10];
    private final MyReadWriteLock lock = new MyReadWriteLock();

//    private ReentrantLock lock = new ReentrantLock();
//    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//    private Lock readLock = lock.readLock();
//    private Lock writeLock = lock.writeLock();

    public BufferData() {
        for (int i=0; i<buffer.length; i++) {
            buffer[i] = '*';
        }
    }

    public String read() throws InterruptedException {
        lock.readLock();
        try {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < buffer.length; i++) {
                builder.append(buffer[i]);
                sleep(100);
            }

            return builder.toString();
        } finally {
            lock.readUnlock();
        }

    }

    public void write(char ch) throws InterruptedException {
        lock.writeLock();
        try {
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = ch;
                sleep(100);
            }
        } finally {
            lock.writeUnlock();
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
