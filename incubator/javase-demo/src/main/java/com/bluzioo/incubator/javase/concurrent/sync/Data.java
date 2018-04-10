package com.bluzioo.incubator.javase.concurrent.sync;

public class Data{

    private char[] buffer = new char[100];

    public Data() {
        for (int i=0; i<20; i++) {
            buffer[i] = '*';
        }
    }

    public synchronized void read() {
        try {
            String name = Thread.currentThread().getName();
            long start = System.currentTimeMillis();

            for (int i=0; i<20; i++) {
                System.out.println(name + "->" + buffer[i]);
                Thread.currentThread().sleep(1000);
            }

            System.out.println(name + "->" +(System.currentTimeMillis()-start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void write(String str) {
        try {
            String name = Thread.currentThread().getName();
            long start = System.currentTimeMillis();

            for (int i=0; i<str.toCharArray().length; i++) {
                buffer[i] = str.toCharArray()[i];
                System.out.println(name + "->" + buffer[i]);
                Thread.currentThread().sleep(1000);
            }

            System.out.println(name + "->" +(System.currentTimeMillis()-start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
