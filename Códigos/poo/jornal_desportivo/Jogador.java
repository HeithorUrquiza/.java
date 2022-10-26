package poo.jornal_desportivo;

public class Jogador extends Pessoa{
    
    private String nacionality;
    private String position;
    private boolean reserve;
    private int cards;

    // Construtor
    public Jogador(String name, String function, String nacionality, String position, boolean reserve) {
        super(name, function);
        this.nacionality = nacionality;
        this.position = position;
        this.reserve = reserve;
        this.cards = 0;
    }

    // Getters e Setters
    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean getReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public int getCards() {
        return cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    // Métodos
    @Override
    public String toString() { // Retorna as informações do jogador
        return "\nNome: " +name+ " | Função: " +function+ " | Nacionalidade: " +nacionality+ " | Posição: " +position+ " | Reserva: " +reserve;
    }
}
