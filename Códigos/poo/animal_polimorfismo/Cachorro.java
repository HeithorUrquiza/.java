package poo.animal_polimorfismo;

public class Cachorro extends Mamifero {

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au au!!!");
    }

}
