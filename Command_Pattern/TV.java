package Command_Pattern;

public class TV {

    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}

class TVCommandOn implements Command {

    private TV tv;

    public TVCommandOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }

}

class TVCommandOff implements Command {

    private TV tv;

    public TVCommandOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }

    @Override
    public void undo() {
        tv.on();
        tv.setInputChannel();
    }

}
