package AirConditioner;


public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }

    public void onAc(){
        isOn = true;
    }

    public boolean isOn(){
        return isOn;
    }

    public void offAc(){
        isOn = false;
    }

    public boolean isOff(){
        return isOn;
    }

    public void increaseTemperature() {
        if (temperature > 30) { temperature = 30; }
        if ( isOn && temperature >= 16 && temperature < 30) temperature++;
    }

    public void decreaseTemperature() {
        if (temperature < 16)  temperature = 16;
        if (isOn && temperature > 16 && temperature < 30  ) temperature--;
    }




}
