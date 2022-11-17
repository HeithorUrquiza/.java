package poo.aeroporto.pessoas;

import java.util.ArrayList;

public class Piloto extends Pessoa{

    private int id;
    private String office;
    private boolean co_pilot;
    private int flight_hours;
    private ArrayList<String> aircrafts;
    

    //Construtor
    public Piloto(String name, String cpf, String birth, int id, boolean co_pilot, int flight_hours,
                  ArrayList<String> aircrafts) {
        super(name, cpf, birth);
        this.id = id;
        this.office = "Pilot";
        this.co_pilot = co_pilot;
        this.flight_hours = flight_hours;
        this.aircrafts = aircrafts;
    }


    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public boolean getCo_pilot() {
        return co_pilot;
    }

    public void setCo_pilot(boolean co_pilot) {
        this.co_pilot = co_pilot;
    }

    public int getFlight_hours() {
        return flight_hours;
    }

    public void setFlight_hours(int flight_hours) {
        this.flight_hours = flight_hours;
    }

    public ArrayList<String> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(ArrayList<String> aircrafts) {
        this.aircrafts = aircrafts;
    }
    

    //Métodos
    public String warnPassengers(){
        return "!";
    }

    public String prepareAircraft(){
        return "";
    }

    @Override
    public String toString() {
        return "Piloto [id=" + id + ", office=" + office + ", co_pilot=" + co_pilot + ", flight_hours=" + flight_hours
                + ", aircrafts=" + aircrafts + "]";
    }
}
