package command;

import command.command.*;
import command.controller.RemoteControl;
import command.receiver.GarageDoor;
import command.receiver.Light;
import command.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command[] commands = {lightOnCommand, garageDoorOpenCommand, stereoOnWithCDCommand};
        MacroCommand macroCommand = new MacroCommand(commands);

        remoteControl.setOnCommand(0, lightOnCommand);
        remoteControl.setOnCommand(1, garageDoorOpenCommand);
        remoteControl.setOnCommand(2, stereoOnWithCDCommand);
        remoteControl.setOnCommand(3, macroCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
    }
}
