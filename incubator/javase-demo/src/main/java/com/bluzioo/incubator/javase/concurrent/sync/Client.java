package com.bluzioo.incubator.javase.concurrent.sync;

public class Client {

    public static void main(String[] args) {

        BufferData bufferData = new BufferData();

        new Thread(new ReadThread(bufferData), "r1").start();
        new Thread(new ReadThread(bufferData), "r2").start();
        new Thread(new ReadThread(bufferData), "r3").start();
        new Thread(new ReadThread(bufferData), "r4").start();
        new Thread(new ReadThread(bufferData), "r5").start();

        new Thread(new WriteThread(bufferData, "ABCDEFGH"), "w1").start();
        new Thread(new WriteThread(bufferData,"01234567"), "w2").start();
    }
}
