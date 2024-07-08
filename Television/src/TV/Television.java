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

    public void increasetVolume() {
        boolean inValidVolume = volume < 0 || volume > 100;
        if(isOn) {
            if (inValidVolume) throw new IllegalStateException("Volume must be between 0 and 100");
            if(!inValidVolume) volume++;
        }
        else throw new IllegalStateException("Tv is off");
    }

    public void decreaseVolume() {
        boolean inValidVolume = volume < 0 || volume > 100;
        if(isOn){
            if(inValidVolume) throw new IllegalStateException("Volume must be between 0 and 100");
            if(!inValidVolume) volume--;
        }
        if (!isOn) throw new IllegalArgumentException("Tv is off");
    }

    public int getVolume() {
      //  if(!isOn) throw new IllegalStateException("Tv is off");
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
