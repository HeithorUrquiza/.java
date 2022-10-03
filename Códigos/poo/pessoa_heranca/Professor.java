package poo.pessoa_heranca;

public class Professor extends Pessoa{
    
    //Atibutos
    private String specialty;
    private double sal;
    
    //Construtor
    public Professor(String name, int age, String sex, String specialty, double sal) {
        super(name, age, sex);
        this.specialty = specialty;
        this.sal = sal;
    }
    
    //Métodos especiais
    public String getSpecialty() {
        return specialty;
    }
    
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    public double getSal() {
        return sal;
    }
    
    public void setSal(double sal) {
        this.sal = sal;
    }

    //Métodos
    public void increaseSal(double sal){
        this.setSal(this.getSal() + sal);
    }

    public String info(){
        return "\n---------------" + 
        String.format("\nNome: [%s] \nIdade: [%d] \nSexo: [%s] \nEspecialidade: [%s] \nSalário: [R$%.2f]",
        this.name, this.age, this.sex, this.specialty, this.sal);
    }
}
