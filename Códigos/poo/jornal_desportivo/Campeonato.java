package poo.jornal_desportivo;

import java.util.ArrayList;

public class Campeonato implements Consulta{

    private int idChamp;
    private String name;
    private int year;
    private Tipo_camp type;
    private ArrayList<Rodada> rounds;

    // Construtor
    public Campeonato(int idChamp, String name, int year, Tipo_camp type, ArrayList<Rodada> rounds) {
        this.idChamp = idChamp;
        this.name = name;
        this.year = year;
        this.type = type;
        this.rounds = rounds;
    }

    //Getters a Setters
    public int getIdChamp() {
        return idChamp;
    }

    public void setIdChamp(int idChamp) {
        this.idChamp = idChamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Tipo_camp getType() {
        return type;
    }

    public void setType(Tipo_camp type) {
        this.type = type;
    }

    public ArrayList<Rodada> getRounds() {
        return rounds;
    }

    public void setRounds(ArrayList<Rodada> rounds) {
        this.rounds = rounds;
    }

    // Métodos
    @Override
    public String consultChampionship(ArrayList<Campeonato> champs, int idChamp) {
        String text = null;
        for (Campeonato campeonato : champs) {
            if (this.getIdChamp() == idChamp) {
                text = campeonato.toString();
            }else{
                text = "\nCampeonato não encontrado";
            }
        }
        return text;
    }

    @Override
    public String displayRating() {
        return "\n** Programação do Campeonato ** \n" + rounds;
    }

    @Override
    public String displaySchedule() {
        return "\nEste campeonato está registrado como: " + this.getType();
    }
    
    @Override
    public String toString() {
        return "\nID: " +idChamp + " | Campeonato " + name + "\nAno: " + year + "\nTipo: " + type + "\nProgramação: "
        + rounds;
    }

    

    
}
