package poo.pessoa_heranca;

public class Tecnico extends Aluno {

    //Atibutos
    private int numRegist;

    //Construtor
    public Tecnico(String name, int age, String sex, int registration, String course) {
        super(name, age, sex, registration, course);
    }

    //Métodos especiais
    public int getNumRegist() {
        return numRegist;
    }

    public void setNumRegist(int numRegist) {
        this.numRegist = numRegist;
    }

    //Métodos
    public void pratice(){
        System.out.printf("\n%s está trabalhando", this.name);
    }
}
