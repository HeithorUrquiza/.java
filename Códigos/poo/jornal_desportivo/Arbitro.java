package poo.jornal_desportivo;

public class Arbitro extends Pessoa {

    private String type;

    // Construtor
    public Arbitro(String name, String function, String type) {
        super(name, function);
        this.type = type;
    }

    // Getters e Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Métodos
    public String referee(){
        return "";
    }
    
}
