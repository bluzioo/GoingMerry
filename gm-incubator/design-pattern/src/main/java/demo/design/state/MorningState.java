package demo.design.state;

public class MorningState implements State {
    @Override
    public void writeProgram(Work work) {

        if (work.getHour() < 12) {
            System.out.println("morning work");
        } else {
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }

    }
}
