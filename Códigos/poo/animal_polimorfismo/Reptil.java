package poo.animal_polimorfismo;

public class Reptil extends Animal{
    
    private String corEscamas;


    public Reptil(double peso, int idade, int membros, String corEscamas) {
        super(peso, idade, membros);
        this.corEscamas = corEscamas;
    }


    public String getCorPelo() {
        return corEscamas;
    }

    public void setCorPelo(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil"); 
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
}
