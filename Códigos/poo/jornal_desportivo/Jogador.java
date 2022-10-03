package poo.jornal_desportivo;

public class Jogador {
    
    private String name;
    private String nacionality;
    private String position;
    private boolean reserve;

    
    public Jogador(String name, String nacionality, String position, boolean reserve) {
        this.name = name;
        this.nacionality = nacionality;
        this.position = position;
        this.reserve = reserve;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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


    @Override
    public String toString() { // Retorna as informações do jogador
        return "\nNome: " +name+ " | Nacionalidade: " +nacionality+ " | Posição: " +position+ " | Reserva: " +reserve;
    }    
}
