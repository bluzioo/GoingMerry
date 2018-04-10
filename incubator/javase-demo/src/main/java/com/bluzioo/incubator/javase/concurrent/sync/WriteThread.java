package com.bluzioo.incubator.javase.concurrent.sync;

public class WriteThread implements Runnable {
    private Data data;

    public WriteThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.write("abcdefgh");
    }
}
