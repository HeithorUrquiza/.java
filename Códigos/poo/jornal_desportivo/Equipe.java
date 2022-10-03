package poo.jornal_desportivo;

import java.util.Arrays;

public class Equipe extends Divisao{
    
    private String name;
    private Jogador player[];
    private int wins;
    private int loses;
    private String technician;

    
    public Equipe(String division, String name, Jogador player[], String technician) {
        super(division);
        this.name = name;
        this.player = player;
        this.wins = 0;
        this.loses = 0;
        this.technician = technician;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getPlayer() {
        return player;
    }    

    public void setPlayer(Jogador player[]) {
        this.player = player;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
    

    @Override
    public void demoteTeam() { 
        if(this.getDivision().equals("Primeira divisão")){
            this.setDivision("Segunda divisão");
        }
    }

    @Override
    public void promotTeam() {
        if(this.getDivision().equals("Segunda divisão")){
            this.setDivision("Primeira divisão");
        }
    }


    @Override
    public String toString() { // Retorna os dados do time/equipe
        return "\nNome: " +name+ "\nDivisão: " +division+ "\nEscalação: " + Arrays.toString(player) 
        + "\n[Vitórias: " +wins+ " | Derrotas: " +loses + "]";
    }

    
}
