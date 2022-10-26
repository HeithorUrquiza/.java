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
    public String referee(Arbitro arbitro,Jogador jogador){ //Aplicação de penalidade
        String text = null;
        if (arbitro.getRole().equals("Bandeirinha")){
            text = "\nImpedimento marcado para " +jogador.getName();
        } else {
            if(jogador.getCards() < 1){
                text = "\nCartão amarelo para " +jogador.getName();
                jogador.setCards(jogador.getCards() + 1);
            } else if (jogador.getCards() == 1){
                text = "\nCartão vermelho para " +jogador.getName();
                jogador.setCards(jogador.getCards() + 1);
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return "\nNome: " +name+ " | Função: " +function+ " | Cargo: " +role;
    }

        
}
