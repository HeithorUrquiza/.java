package poo.animal_polimorfismo;

public abstract class Animal {
    
    //Atributos
    protected double peso;
    protected int idade;
    protected int membros;
    
    //Construtor 
    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    //Métodos especiais
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //Métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
