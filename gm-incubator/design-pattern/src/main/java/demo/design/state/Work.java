package demo.design.state;

public class Work {

    private State current;

    private int hour;

    public Work() {
        current = new MorningState();
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
