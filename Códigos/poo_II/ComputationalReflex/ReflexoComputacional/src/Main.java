import entities.Car;
import entities.ComputationalReflex;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(7000, 5);
        ComputationalReflex rc = new ComputationalReflex();

        Thread thread1 = new Thread(() -> {
            while(true) {
                try {
                    car.accelerate();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while(true) {
                rc.execute(car);
            }
        });

        thread1.start();
        thread2.start();
    }
}