package poo.aeroporto.voos;

import java.util.ArrayList;

public interface Interface_voo {
    
    public abstract String consultFlight(int id, ArrayList<Voo> flights);
    public abstract void flightHistory(String date, ArrayList<Voo> flights);
    public abstract void confirmFlight();
    public abstract void cancelFlight();

}
