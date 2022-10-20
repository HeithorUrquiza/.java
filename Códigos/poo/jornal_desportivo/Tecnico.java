package poo.jornal_desportivo;

public class Tecnico extends Pessoa{

    // Construtor
    public Tecnico(String name, String function) {
        super(name, function);
    }
    
    // Métodos
    public String deviseTactics(){
        return "{*Fazendo o planejamento de jogo*}";
    }

    public String passTactics(){
        return "{*Reunindo o time e repassando as táticas*}";
    }

    @Override
    public String toString() {
        return "Nome: " +name+ " | Função: " +function;
    }
}
