package command.controller;

import command.command.Command;
import command.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
        }
    }

    public void setOnCommand(int i, Command onCommand) {
        onCommands[i] = onCommand;
    }
    public void setOffCommands(int i, Command offCommand) {
        offCommands[i] = offCommand;
    }
    public void onButtonWasPushed(int i) {
        onCommands[i].execute();
        undoCommand = onCommands[i];
    }
    public void offButtonWasPushed(int i) {
        offCommands[i].execute();
        undoCommand = offCommands[i];
    }
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
