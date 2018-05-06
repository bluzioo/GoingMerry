package demo.thrift.async;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;

import java.util.concurrent.CountDownLatch;

public class MethodCallback implements AsyncMethodCallback {

    private CountDownLatch latch;

    public MethodCallback(CountDownLatch latch) {
        this.latch = latch;
    }

    // 处理服务返回的结果值
    @Override
    public void onComplete(Object response) {
        System.out.println("onComplete");
        try {
            // Thread.sleep(1000L * 1);
            System.out.println("AsynCall result =:" + response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }

    }

    // 处理调用服务过程中出现的异常
    @Override
    public void onError(Exception e) {

    }
}
