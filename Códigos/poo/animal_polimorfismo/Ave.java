package poo.animal_polimorfismo;

public class Ave extends Animal {
    
    private String corPena;


    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas ou minhocas"); 
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de passarinho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando alto");  
    }

    public void fazerNinho(){
        System.out.println("Construindo um ninho");
    }
}
