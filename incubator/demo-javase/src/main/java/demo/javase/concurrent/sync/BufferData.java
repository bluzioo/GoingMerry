package demo.javase.concurrent.sync;

public class BufferData {

    private char[] buffer = new char[10];

    public BufferData() {
        for (int i=0; i<buffer.length; i++) {
            buffer[i] = '*';
        }
    }

    public synchronized String read() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<buffer.length; i++) {
            builder.append(buffer[i]);
            sleep(100);
         }
         return builder.toString();
    }

    public synchronized void write(char ch) {
        for (int i=0; i<buffer.length; i++) {
            buffer[i] = ch;
            sleep(100);
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
