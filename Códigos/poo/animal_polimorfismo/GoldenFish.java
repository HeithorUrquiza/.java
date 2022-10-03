package poo.animal_polimorfismo;

public class GoldenFish extends Peixe{

    public GoldenFish(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo ração");
    }
}
