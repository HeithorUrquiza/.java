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
    public String referee(Jogador jogador){ //Aplicação de penalidade
        String text = null;
        if (this.getRole().equals("Bandeirinha")){
            text = "Impedimento marcado para " +jogador.getName();
        } else {
            if(jogador.getCards() == 0){
                text = "Cartão amarelo para " +jogador.getName();
                jogador.setCards(jogador.getCards() + 1);
            } else if (jogador.getCards() == 2){
                text = "Cartão vermelho para " +jogador.getName();
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return "\nNome: " +name+ " | Função: " +function+ " | Cargo: " +role;
    }

        
}
