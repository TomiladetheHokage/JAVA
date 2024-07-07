package TV;

public class Television {
    private boolean isOn;
    private int volume;
    private boolean isMute;
    private int chanel;

    public Television() {
        isOn = false;
        volume = 0;
        isMute = false;
        chanel = 0;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean tvState() {
        return isOn;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) throw new IllegalArgumentException("Volume must be between 0 and 100");
        volume++;

    }

    public void decreaseVolume(int volume) {
        if (volume < 0 || volume > 100) throw new IllegalArgumentException("Volume must be between 0 and 100");
        volume--;
    }

    public int getVolume() {
        return volume;
    }

    public void Mute(boolean mute) {
        isMute = true;
    }

    public void unMute(boolean mute) {
        isMute = false;
    }

    public boolean muteState() {
        return isMute;
    }

    public void changeChanel(int chanel) {
        chanel ++;
    }

    public void previousChannel(int chanel) {
        chanel --;
    }


}
