package Command_Pattern;

public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}

class LightCommandOn implements Command {

    private Light light;

    public LightCommandOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();
    }

}
class LightCommandOff implements Command {

    private Light light;

    public LightCommandOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();
    }

}