package poo.aeroporto.aeronave;

import java.util.ArrayList;

public class Aeronave {
    
    private int id;
    private String model;
    private String air_sort;
    private ArrayList<Assento> seats;
    private int num_seats;
    private boolean operant;
    private String company;


    //Construtor
    public Aeronave(int id, String model, ArrayList<Assento> seats, int num_seats,
            String company) {
        this.id = id;
        this.model = model;
        this.air_sort = "Avião";
        this.seats = seats;
        this.num_seats = num_seats;
        this.operant = false;
        this.company = company;
    }


    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAir_sort() {
        return air_sort;
    }

    public void setAir_sort(String air_sort) {
        this.air_sort = air_sort;
    }

    public ArrayList<Assento> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Assento> seats) {
        this.seats = seats;
    }

    public int getNum_seats() {
        return num_seats;
    }

    public void setNum_seats(int num_seats) {
        this.num_seats = num_seats;
    }

    public boolean getOperant() {
        return operant;
    }

    public void setOperant(boolean operant) {
        this.operant = operant;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    //Métodos

    public void checkPilotPermission(ArrayList<String> pilot_aircrafts){
        for (String aircraft: pilot_aircrafts){
            if (this.getModel().equals(aircraft)){
                this.setOperant(true);
            }
        }
    }

    public String takeOff(){
        String msg = null;
        if(operant){
            msg = "\n*{Iniciando decolangem. Aeronave saindo do aeroporto}*";
        } else {
            msg = "\n*{Falha na decolagem}*";
        }
        return msg;
    }

    public String land(){
        this.setOperant(false);
        return "\n*{Aeronave pousando no aeroporto e seguindo para zona de desembarque}*";
    }

    @Override
    public String toString() {
        return "\nAeronave [id=" + id + ", model=" + model + ", air_sort=" + air_sort + ", seats=" + seats
                + ", num_seats=" + num_seats + ", operant=" + operant + ", company=" + company + "]";
    }  
}
