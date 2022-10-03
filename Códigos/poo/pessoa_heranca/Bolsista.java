package poo.pessoa_heranca;

public class Bolsista extends Aluno {

    //Atibutos
    private int scholarShip;

    //Construtor
    public Bolsista(String name, int age, String sex, int registration, String course) {
        super(name, age, sex, registration, course);
    }

    //Métodos especiais
    public int getScholarship() {
        return scholarShip;
    }

    public void setScholarship(int scholarship) {
        this.scholarShip = scholarship;
    }

    //Métodos
    public void renewScholarship(){
        System.out.println("\nBolsa renovada!!");
    }
    
    @Override
    public void payMonth() {
        System.out.println("\nPagamento facilitado para: " + this.name);
    }
}
