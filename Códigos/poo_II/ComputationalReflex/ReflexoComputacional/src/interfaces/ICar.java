package interfaces;

import java.util.Map;

public interface ICar {
    void accelerate() throws InterruptedException;
    int getMaxRPM();
    int getCurrentRPM();
    void setCurrentRPM(int currentRPM);
    int getCurrentGear();
    void setCurrentGear(int currentGear);
    Map<String, Integer> getGearOptions();
    int getSpeed();
    void setSpeed(int speed);
}
