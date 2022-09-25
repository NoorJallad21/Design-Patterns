package Command_Pattern;

import java.util.Stack;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    Stack<Integer> execute;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
        execute = new Stack<>();
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}

class HighFanCommand implements Command {

    private CeilingFan fan;

    public HighFanCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
        fan.execute.push(fan.getSpeed());
    }

    @Override
    public void undo() {
        if (fan.execute.size() == 1) {
            fan.execute.pop();
        } else if (fan.execute.size() > 1) {
            fan.execute.pop();
            Integer s = fan.execute.pop();
            if (s != null) {
                if (s.equals(fan.HIGH)) {
                    fan.high();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.MEDIUM)) {
                    fan.medium();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.LOW)) {
                    fan.low();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.OFF)) {
                    fan.off();
                    fan.execute.push(fan.getSpeed());
                }
            }
        }
    }

}

class MediumFanCommand implements Command {

    private CeilingFan fan;

    public MediumFanCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.medium();
        fan.execute.push(fan.getSpeed());
    }

    @Override
    public void undo() {
        if (fan.execute.size() == 1) {
            fan.execute.pop();
        } else if (fan.execute.size() > 1) {
            fan.execute.pop();
            Integer s = fan.execute.pop();
            if (s != null) {
                if (s.equals(fan.HIGH)) {
                    fan.high();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.MEDIUM)) {
                    fan.medium();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.LOW)) {
                    fan.low();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.OFF)) {
                    fan.off();
                    fan.execute.push(fan.getSpeed());
                }
            }
        }
    }

}

class LowFanCommand implements Command {

    private CeilingFan fan;

    public LowFanCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.low();
        fan.execute.push(fan.getSpeed());
    }

    @Override
    public void undo() {
        if (fan.execute.size() == 1) {
            fan.execute.pop();
        } else if (fan.execute.size() > 1) {
            fan.execute.pop();
            Integer s = fan.execute.pop();
            if (s != null) {
                if (s.equals(fan.HIGH)) {
                    fan.high();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.MEDIUM)) {
                    fan.medium();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.LOW)) {
                    fan.low();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.OFF)) {
                    fan.off();
                    fan.execute.push(fan.getSpeed());
                }
            }
        }
    }

}

class OffFanCommand implements Command {

    private CeilingFan fan;

    public OffFanCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
        fan.execute.push(fan.getSpeed());
    }

    @Override
    public void undo() {
        if (fan.execute.size() == 1) {
            fan.execute.pop();
        } else if (fan.execute.size() > 1) {
            fan.execute.pop();
            Integer s = fan.execute.pop();
            if (s != null) {
                if (s.equals(fan.HIGH)) {
                    fan.high();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.MEDIUM)) {
                    fan.medium();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.LOW)) {
                    fan.low();
                    fan.execute.push(fan.getSpeed());
                } else if (s.equals(fan.OFF)) {
                    fan.off();
                    fan.execute.push(fan.getSpeed());
                }
            }
        }
    }

}
