package poo.pessoa_heranca;

public class Funcionario extends Pessoa{
    
    //Atibutos
    private String sector;
    private boolean working;
    
    //Construtor
    public Funcionario(String name, int age, String sex, String sector) {
        super(name, age, sex);
        this.sector = sector;
        this.working = true;
    }

    //Métodos especiais
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean getWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    //Métodos
    public void changeWork(){
        this.setWorking(false);
    }

    public String info(){
        return "\n---------------" + 
        String.format("\nNome: [%s] \nIdade: [%d] \nSexo: [%s] \nSetor: [%s] \nTrabahando: [%b]",
        this.name, this.age, this.sex, this.sector, this.working);
    }
}
