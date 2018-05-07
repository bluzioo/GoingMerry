package demo.design.state;

public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<17) {
            System.out.println("afternoon work");
        } else {
            work.setCurrent(new NightState());
            work.writeProgram();
        }
    }
}
