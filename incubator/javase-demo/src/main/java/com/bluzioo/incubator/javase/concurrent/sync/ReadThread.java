package com.bluzioo.incubator.javase.concurrent.sync;

public class ReadThread implements Runnable {

    private BufferData bufferData;

    public ReadThread(BufferData bufferData) {
        this.bufferData = bufferData;
    }

    @Override
    public void run() {

        while (true) {
            long start = System.currentTimeMillis();
            String str = bufferData.read();
            System.out.println(Thread.currentThread().getName() + "->" + str + "->" + (System.currentTimeMillis()-start));
        }

    }
}
