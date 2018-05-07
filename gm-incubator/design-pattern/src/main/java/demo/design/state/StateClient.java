package demo.design.state;

/**
 * 状态模式客户端
 */
public class StateClient {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(20);
        work.writeProgram();
    }
}
