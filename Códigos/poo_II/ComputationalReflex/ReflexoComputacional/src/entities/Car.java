package entities;

import interfaces.ICar;

import java.util.HashMap;
import java.util.Map;

public class Car implements ICar {
    private Integer maxRPM;
    private Integer speed = 1;
    private Integer currentRPM;
    private Integer numberGears = 1;
    private Integer currentGear = 1;
    private Map<String, Integer> gearOptions = new HashMap<>();

    public Car(int maxRPM, int numberGears) {
        this.maxRPM = maxRPM;
        this.numberGears = numberGears;
        this.limitsGears();
        this.setCurrentRPM(100);
        System.out.println("O carro está ligado.");
    }

    public void accelerate() throws InterruptedException {
        if (this.speed < 200) {
            setSpeed(this.speed + 2);
            setCurrentRPM(this.currentRPM + 150);
            print();
            Thread.sleep(200);
            this.isLimitRPM();
            accelerate();
        }
    }

    public void limitsGears() {
        this.gearOptions.put(String.valueOf(1), getMaxRPM() - 3000);
        this.gearOptions.put(String.valueOf(2), getMaxRPM() - 2500);
        this.gearOptions.put(String.valueOf(3), getMaxRPM() - 2000);
        this.gearOptions.put(String.valueOf(4), getMaxRPM() - 1500);
        this.gearOptions.put(String.valueOf(5), getMaxRPM() - 1000);
    }

    public boolean isLimitRPM() {
        if (!(this.currentRPM >= this.maxRPM)) {
            return false;
        }
        throw new Error("\nO carro vai explodir.");
    }

    private void print() {
        System.out.print(
                "\rVelocidade atual: "
                        + this.speed
                        + " km/h RPM: "
                        + this.currentRPM
                        + " Marcha: "
                        + this.currentGear
        );
    }

    public Map<String, Integer> getGearOptions() {
        return gearOptions;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int currentRPM) {
        this.currentRPM = currentRPM;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}