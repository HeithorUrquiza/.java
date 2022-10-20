package poo.jornal_desportivo;

public class Pessoa {
    
    protected String name;
    protected String function;
    
    // Construtor
    public Pessoa(String name, String function) {
        this.name = name;
        this.function = function;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }  
}
