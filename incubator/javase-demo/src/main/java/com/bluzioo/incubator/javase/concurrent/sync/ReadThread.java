package com.bluzioo.incubator.javase.concurrent.sync;

public class ReadThread implements Runnable {

    private Data data;
    public ReadThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.read();
    }
}
