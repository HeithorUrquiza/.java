package poo.jornal_desportivo;

public class Arbitro extends Pessoa {

    private String role;

    // Construtor
    public Arbitro(String name, String function, String role) {
        super(name, function);
        this.role = role;
    }

    // Getters e Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Métodos
    public String referee(){
        return "";
    }

    @Override
    public String toString() {
        return "\nNome: " +name+ " | Função: " +function+ " | Cargo: " +role;
    }

        
}
