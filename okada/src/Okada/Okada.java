package Okada;

public class Okada {

    public boolean isOn;
    public int initialSpeed = 0;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
        initialSpeed = 0;
    }

    public boolean isOff() {
        return isOn;
    }

    public void accelerateGear1() {
        if (isOn && initialSpeed >= 0 ) {
            initialSpeed++;

        }
    }

    public void accelerateGear2() {
        if (isOn && initialSpeed >= 21 ) {
            initialSpeed = initialSpeed + 2;
        }
    }
    public void accelerateGear3() {
        if (isOn && initialSpeed >= 31 ) {
            initialSpeed = initialSpeed + 3;
        }
    }
    public void accelerateGear4() {
        if (isOn && initialSpeed >= 41 ) {
            initialSpeed = initialSpeed + 4;
        }
    }

    public int getCurrentSpeed() {
        return initialSpeed;
    }
}