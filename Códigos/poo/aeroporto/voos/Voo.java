package poo.aeroporto.voos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import poo.aeroporto.pessoas.Passageiro;
import poo.aeroporto.aeronave.Aeronave;
import poo.aeroporto.pessoas.Aeromoca;
import poo.aeroporto.pessoas.Piloto;

public class Voo implements Interface_voo{

    private int id;
    private Piloto pilot;
    private Piloto co_pilot;
    private Aeromoca steward;
    private ArrayList<Passageiro> passengers;
    private Aeronave aircraf;
    private String departure_local;
    private String arrival_local;
    private String departure_hour;
    private String arrival_hour;
    private String date;
    private boolean flight_permit;

    
    //Construtor
    public Voo(int id, Piloto pilot, Piloto co_pilot, Aeromoca steward, ArrayList<Passageiro> passengers,
            Aeronave aircraf, String departure_local, String arrival_local, String departure_hour, String arrival_hour,
            String date) {
        this.id = id;
        this.pilot = pilot;
        this.co_pilot = co_pilot;
        this.steward = steward;
        this.passengers = passengers;
        this.aircraf = aircraf;
        this.departure_local = departure_local;
        this.arrival_local = arrival_local;
        this.departure_hour = departure_hour;
        this.arrival_hour = arrival_hour;
        this.date = date;
        this.flight_permit = false;
    }


    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Piloto getPilot() {
        return pilot;
    }

    public void setPilot(Piloto pilot) {
        this.pilot = pilot;
    }

    public Piloto getCo_pilot() {
        return co_pilot;
    }

    public void setCo_pilot(Piloto co_pilot) {
        this.co_pilot = co_pilot;
    }

    public Aeromoca getSteward() {
        return steward;
    }

    public void setSteward(Aeromoca steward) {
        this.steward = steward;
    }

    public ArrayList<Passageiro> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passageiro> passengers) {
        this.passengers = passengers;
    }

    public Aeronave getAircraf() {
        return aircraf;
    }

    public void setAircraf(Aeronave aircraf) {
        this.aircraf = aircraf;
    }

    public String getDeparture_local() {
        return departure_local;
    }

    public void setDeparture_local(String departure_local) {
        this.departure_local = departure_local;
    }

    public String getArrival_local() {
        return arrival_local;
    }

    public void setArrival_local(String arrival_local) {
        this.arrival_local = arrival_local;
    }

    public String getDeparture_hour() {
        return departure_hour;
    }

    public void setDeparture_hour(String departure_hour) {
        this.departure_hour = departure_hour;
    }

    public String getArrival_hour() {
        return arrival_hour;
    }

    public void setArrival_hour(String arrival_hour) {
        this.arrival_hour = arrival_hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getFlight_permit() {
        return flight_permit;
    }

    public void setFlight_permit(boolean flight_permit) {
        this.flight_permit = flight_permit;
    }


    //Métodos
    @Override
    public void cancelFlight() {
        this.setFlight_permit(false);
    }

    @Override
    public void confirmFlight() {
        this.setFlight_permit(true);
    }

    @Override
    public String consultFlight(int id, ArrayList<Voo> flights) {
        String msg = null;
        Map<Integer, Voo> consult = new HashMap<Integer, Voo>();
        for(Voo flight: flights){
            consult.put(flight.getId(), flight);
        }
        if (id == consult.get(id).id){
            msg = "\nID: " +getId()+ " | Data: " +getDate()+ " | Local-Partida: " +getDeparture_local()+ " | Local-Chegada: " +getArrival_local()+ "\nHorário-Partida: " +getDeparture_hour()+ " | Horário-Chegada: " +getArrival_hour()+ " | Voo Confirmado: " +getFlight_permit();
        } else {
            msg = "\nVoo não cadastrado no sistema";
        }
        return msg;
    }

    @Override
    public String flightHistory(String date, ArrayList<Voo> flights) {
        Map<String, Voo> consult = new HashMap<String, Voo>();
        for (Voo flight: flights){
            if(date.equals(flights.get(id).getDate())){
                consult.put(flights.get(id).getDate(), flight);
            }
        }
        return consult.get(date).toString();
    }

    @Override
    public String toString() {
        return "\nID: " +getId()+ " | Data: " +getDate()+ " | Local-Partida: " +getDeparture_local()+ " | Local-Chegada: " +getArrival_local()+ "\nPiloto: " +getPilot()+ " | Co-Piloto: " +getCo_pilot()+ " | Comissário(a): " +getSteward()+ " | Aeronave: " +getAircraf()+ "\nHorário-Partida: " +getDeparture_hour()+ " | Horário-Chegada: " +getArrival_hour()+ " | Voo Confirmado: " +getFlight_permit()+ "\nPassageiros: " +getPassengers();
    }
    
}
