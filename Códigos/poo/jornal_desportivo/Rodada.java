package poo.jornal_desportivo;

import java.util.ArrayList;

public class Rodada {
    
    private int numRound;
    private int year;
    private ArrayList<Jogo> matches;

    // Construtor
    public Rodada(int numRound, int year, ArrayList<Jogo> matches) {
        this.numRound = numRound;
        this.year = year;
        this.matches = matches;
    }

    // Getters e Setters
    public int getNumRound() {
        return numRound;
    }

    public void setNumRound(int numRound) {
        this.numRound = numRound;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Jogo> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Jogo> matches) {
        this.matches = matches;
    }

    // Métodos
    public String consultRound(ArrayList<Rodada> rounds, int numRound){
        String text = null;
        for (Rodada rodada : rounds) {
            if (this.getNumRound() == numRound){ // Consulta a rodada baseado no ID
                text = rodada.toString();
            } else {
                text = "\nRodada não encontrada";
            }
        }
        return text;
    }

    /*public String consultaRound(ArrayList<Rodada> rounds, int year){
        String text = null;
        for (Rodada rodada : rounds) {
            if (this.getYear() == year) {
                text = rodada.toString();
            } else {
                text = "Rodada não encontrada";
            }
        }
        return text;
    }*/

    @Override
    public String toString() {
        return "ID Rodada: " +numRound+ " | Ano: " +year+ " | Jogos: " + matches;
    }
}
