package poo.jornal_desportivo;

import java.util.ArrayList;

public class Equipe {
    
    private String name;
    private String division;
    private ArrayList<Jogador> players;
    private int amPoints;
    private int wins;
    private int loses;
    private String technician;


    public Equipe(String division, String name, ArrayList<Jogador> players, String technician) {
        this.name = name;
        this.division = division;
        this.players = players;
        this.amPoints = 20;
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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Jogador> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Jogador> players) {
        this.players = players;
    }

    public int getAmPoints() {
        return amPoints;
    }

    public void setAmPoints(int amPoints) {
        this.amPoints = amPoints;
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
    

    public void demoteTeam() { 
        if(this.getDivision().equals("Regional") && this.getAmPoints() < 0){
            this.setDivision("Primeira divisão");
        }else if(this.getDivision().equals("Primeira divisão") && this.getAmPoints() < 0){
            this.setDivision("Segunda divisão");
        }
    }

    public void promotTeam() {
        if(this.getDivision().equals("Segunda divisão") && this.getAmPoints() > 70){
            this.setDivision("Primeira divisão");
        }else if(this.getDivision().equals("Primeira divisão") && this.getAmPoints() > 70){
            this.setDivision("Regional");
        }

    }

    public String toString() { // Retorna os dados do time/equipe
        return "\nNome: " +name+ "\nDivisão: " +division+ "\nEscalação: " + players
        + "\n[Pontos: "+amPoints+ "Vitórias: " +wins+ " | Derrotas: " +loses + "]";
    }
}
