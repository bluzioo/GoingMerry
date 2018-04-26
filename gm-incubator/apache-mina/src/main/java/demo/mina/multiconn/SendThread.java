package demo.mina.multiconn;

public class SendThread extends Thread {

    public SendThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 2;
        while (i-->0) {
            Client.send();
        }
    }

}
