package com.bluzioo.incubator.javase.concurrent.sync;

public class SyncMain {

    public static void main(String[] args) {

        Data data = new Data();

        new Thread(new WriteThread(data), "w1").start();
        new Thread(new WriteThread(data), "w2").start();
        new Thread(new WriteThread(data), "w3").start();


        new Thread(new ReadThread(data), "r1").start();
        new Thread(new ReadThread(data), "r2").start();
        new Thread(new ReadThread(data), "r3").start();
        new Thread(new ReadThread(data), "r4").start();
        new Thread(new ReadThread(data), "r5").start();



    }
}
