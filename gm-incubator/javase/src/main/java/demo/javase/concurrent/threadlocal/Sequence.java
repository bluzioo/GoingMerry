package demo.javase.concurrent.threadlocal;

public class Sequence {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public int getNum() {
        threadLocal.set(threadLocal.get() + 1);
        return threadLocal.get();
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence();

        new Thread(new ClientThread(seq)).start();
        new Thread(new ClientThread(seq)).start();
        new Thread(new ClientThread(seq)).start();
    }

}
