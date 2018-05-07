package demo.design.state;

public class NightState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<21) {
            System.out.println("off work");
        }
    }
}
