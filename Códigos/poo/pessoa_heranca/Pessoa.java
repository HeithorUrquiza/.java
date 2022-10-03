package poo.pessoa_heranca;

public abstract class Pessoa {
    
    //Atributos
    protected String name;
    protected int age;
    protected String sex;
    
    //Construtor
    public Pessoa(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    //Métodos especiais
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    //Métodos
    public final void birthday(){
        this.setAge(this.getAge() + 1);
    }
    
}
