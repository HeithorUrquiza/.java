package entities;
import java.lang.reflect.Field;
public class ComputationalReflex {
    public void execute(Car car) {

        try {
            Field currentGear = Car.class.getDeclaredField("currentGear");
            Field currentRPM = Car.class.getDeclaredField("currentRPM");
            Field currentSpeed = Car.class.getDeclaredField("speed");

            currentGear.setAccessible(true);
            currentRPM.setAccessible(true);
            currentSpeed.setAccessible(true);

            boolean canShift = validateRPM(car);

            if (canShift) {
                currentGear.set(car, car.getCurrentGear() + 1);
                currentRPM.set(car, car.getCurrentRPM() - 2500);
                currentSpeed.set(car, car.getSpeed() - 1);
            }

            if (car.getSpeed() >= 200) {
                System.out.println("\nO carro chegou à sua velocidade máxima sem apresentar problemas.");
                System.exit(0);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

        public boolean validateRPM(Car car) {
        var gears = car.getGearOptions();
        var currentGear = car.getCurrentGear();
        var RPM = car.getCurrentRPM();
        var maxRPM = gears.get(String.valueOf(currentGear));
        return RPM >= maxRPM;
    }
}
