package demo.javase.concurrent.lock;

public class WriteThread implements Runnable {
    private BufferData bufferData;
    private String str;
    private int index = 0;

    public WriteThread(BufferData bufferData, String str) {
        this.bufferData = bufferData;
        this.str = str;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bufferData.write(next());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private char next() {
        char c = str.charAt(index);
        index ++;
        if (index >= str.length()) {
            index = 0;
        }
        return c;
    }
}
