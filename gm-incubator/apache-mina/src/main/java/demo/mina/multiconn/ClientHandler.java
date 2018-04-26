package demo.mina.multiconn;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class ClientHandler extends IoHandlerAdapter {


    @Override
    public void sessionCreated(IoSession session) throws Exception {
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
    }

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {


    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        System.out.println(message + "--------" + Thread.currentThread().getName());
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        System.out.println(message + "--------" + "sent" + "-----" +Thread.currentThread().getName() );
    }

    @Override
    public void inputClosed(IoSession session) throws Exception {
        session.closeNow();
    }

}
