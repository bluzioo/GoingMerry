package com.bluzioo.incubator.javase.concurrent.lock;

public class MyReadWriteLock {

    private int readCount = 0;
    private int writeCount = 0;
    private int waitingWriteCount = 0;
    private boolean writePriority = true;


    public synchronized void readLock() throws InterruptedException {
        if (writeCount > 0 || (writePriority &&  waitingWriteCount > 0)) {
            wait();
        }
        readCount ++;
    }

    public synchronized void readUnlock() {
        readCount--;
        writePriority = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriteCount++;
        try {
            if (readCount > 0 || writeCount > 0) {
                wait();
            }
        } finally {
            waitingWriteCount--;
        }
        writeCount++;
    }

    public synchronized void writeUnlock() {
        writeCount--;
        writePriority = false;
        notifyAll();
    }


}
