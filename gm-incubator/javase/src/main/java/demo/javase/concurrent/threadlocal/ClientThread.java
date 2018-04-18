package demo.javase.concurrent.threadlocal;


public class ClientThread implements Runnable{

    private Sequence seq;

    ClientThread(Sequence seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            System.out.println(Thread.currentThread().getName() + "=" + seq.getNum());
        }
    }
}
