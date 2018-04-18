package demo.javase.concurrent.sync;

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
            bufferData.write(next());
        }
    }

    private char next() {
        index ++;
        if (index >= str.length()) {
            index = 0;
        }
        return str.charAt(index);
    }
}
