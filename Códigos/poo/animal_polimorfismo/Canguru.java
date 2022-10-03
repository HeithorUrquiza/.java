package poo.animal_polimorfismo;

public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }

}
