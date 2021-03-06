package demo.javase.concurrent.sync;

public class ReadThread implements Runnable {

    private BufferData bufferData;

    public ReadThread(BufferData bufferData) {
        this.bufferData = bufferData;
    }

    @Override
    public void run() {

        while (true) {
            long start = System.currentTimeMillis();
            for (int i=0; i<10; i++) {
                String str = bufferData.read();
                System.out.println(Thread.currentThread().getName() + "->" + str);
            }
            System.out.println(Thread.currentThread().getName() + "---------------->" + (System.currentTimeMillis()-start));
        }

    }
}
