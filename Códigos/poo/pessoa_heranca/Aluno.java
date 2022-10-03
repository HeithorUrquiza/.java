package poo.pessoa_heranca;

public class Aluno extends Pessoa{
    
    //Atributos
    private int registration;
    private String course;
    
    //Construtor
    public Aluno(String name, int age, String sex, int registration, String course) {
        super(name, age, sex);
        this.registration = registration;
        this.course = course;
    }

    //Métodos especiais
    public int getRegistration() {
        return registration;
    }
    
    public void setRegistration(int registration) {
        this.registration = registration;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }

    //Métodos
    public void payMonth(){
        System.out.println("\nPagamanto de mensalidade atualizado para: " + this.name);
    } 
    
}
