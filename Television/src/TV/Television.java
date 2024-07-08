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
        boolean inValidVolume = volume > 2;
        if(isOn) {
            if (inValidVolume) throw new IllegalStateException("Volume must be between 0 and 100");
            if(!inValidVolume) volume++;
        }
        else throw new IllegalStateException("Tv is off");
    }

    public void decreaseVolume() {
        boolean inValidVolume = volume < 0 ;
        if(isOn){
            if(inValidVolume) throw new IllegalStateException("Volume must be between 0 and 100");
            if(!inValidVolume) volume--;
        }
        if (!isOn) throw new IllegalStateException("Tv is off");
    }

    public int getVolume() {
        if(!isOn) throw new IllegalStateException("Tv is off");
        return volume;
    }

    public void mute() {
        if(isOn){
            isMute = true;
        }
        else throw new IllegalStateException("Tv is off");
    }

    public void unMute() {
        if(isOn) {
            isMute = false;
        }
        else {
            throw new IllegalStateException("Tv is off");
        }
    }

    public boolean muteState() {
        return isMute;
    }

    public void changeChanel(int chanel) {
        if(isOn) {
            this.chanel += chanel;
        }
        else throw new IllegalStateException("Tv is off");
    }

    public int getChannel() {
        if(!isOn) throw new IllegalStateException("Tv is off");
        return chanel;
    }


}
