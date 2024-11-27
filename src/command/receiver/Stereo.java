package command.receiver;

public class Stereo {
    int volume;
    public void on() {
        System.out.println("Stereo is On");
    }
    public void off() {
        System.out.println("Stereo is Off");
    }
    public void setCD() {
        System.out.println("Stereo Set CD");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo set volume " + volume);
    }
    public int getVolume() {
        return volume;
    }
}
