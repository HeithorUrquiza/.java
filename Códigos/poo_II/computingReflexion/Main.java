package poo_II.computingReflexion;

public class Main {
    public static void main(String[] args) {
        do{
            CarFactory.createCar("poo_II.computingReflexion.Car");
                
            if (CarFactory.finishFactory().equals("y")){
                break;
            }
        } while(true);
    }
}
