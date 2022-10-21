package poo.jornal_desportivo;

import java.util.ArrayList;

public interface Consulta {
    
    public abstract String consultChampionship(ArrayList<Campeonato> champs, int idChamp);
    public abstract String displaySchedule();
    public abstract String displayRating();
    
}
