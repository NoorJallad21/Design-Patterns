package Command_Pattern;

public class RemoteLoader {
    
    public static void main(String[] args) {
        // 1. make an instance of the invoker, RemoteControl Class
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        // 2.  set the commands related to the light receiver on the slot 0 of the invoker
        Light light = new Light("Light");
        LightCommandOn onLight = new LightCommandOn(light);
        LightCommandOff offLight = new LightCommandOff(light);
        
        remote.setCommand(0, onLight, offLight);

        // 3. trigger the action that switch the light on, then trigger the light that switch it off
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        // 4. undo the last command
        remote.undoButtonWasPushed();
        // 5. repeat steps 3 and 4 but this time in 3, switch the light off then on after that trigger the undo 
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
        
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        // 6. set the commands related to the fan on slots 1,2,3, in the order Low, medium, and high
        LowFanCommand low=new LowFanCommand(ceilingFan);
        MediumFanCommand mid=new MediumFanCommand(ceilingFan);
        HighFanCommand high=new HighFanCommand(ceilingFan);
        OffFanCommand off=new OffFanCommand(ceilingFan);
        
        remote.setCommand(1, low, off);
        remote.setCommand(2, mid, off);
        remote.setCommand(3, high, off);
        // 7. switch the fan on on low speed, then switch it off, after that trigger the undo
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
        // 8. now run the fan on high speed
        remote.onButtonWasPushed(3);
        // 9. undo the command in 8
        remote.undoButtonWasPushed();
    }
}
