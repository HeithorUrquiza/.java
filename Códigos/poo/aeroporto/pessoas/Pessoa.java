package poo.aeroporto.pessoas;

public abstract class Pessoa {
    
    private String name;
    private String cpf;
    private String birth;
    
    //Construtor
    public Pessoa(String name, String cpf, String birth) {
        this.name = name;
        this.cpf = cpf;
        this.birth = birth;
    }
    
    //Get e set
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getBirth() {
        return birth;
    }
    
    public void setBirth(String birth) {
        this.birth = birth;
    }
}
