package command.command;

import command.command.Command;
import command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    int prevVolume;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
        stereo.setCD();
        stereo.setVolume(prevVolume);
    }
}
