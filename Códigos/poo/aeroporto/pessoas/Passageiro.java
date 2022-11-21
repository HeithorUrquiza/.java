package poo.aeroporto.pessoas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import poo.aeroporto.aeronave.Assento;

public class Passageiro extends Pessoa{
    
    private Assento seat;
    private String tipe_service;
    private boolean embarked;


    //Construtor
    public Passageiro(String name, String cpf, String birth, String tipe_service) {
        super(name, cpf, birth);
        this.seat = null;
        this.tipe_service = tipe_service;
        this.embarked = false;
    }


    //Get e Set
    public Assento getSeat() {
        return seat;
    }

    public void setSeat(Assento seat) {
        this.seat = seat;
    }

    public String getTipe_service() {
        return tipe_service;
    }

    public void setTipe_service(String tipe_service) {
        this.tipe_service = tipe_service;
    }

    public boolean getEmbarked() {
        return embarked;
    }

    public void setEmbarked(boolean embarked) {
        this.embarked = embarked;
    }

    
    //Métodos
    public void toReserveSeat(String idSeat, ArrayList<Assento> seats){
        Map<String, Assento> reserve = new HashMap<>();
        for (Assento seat : seats) {
            reserve.put(seat.getId(), seat);
        }
        if (reserve.get(idSeat).getOccupied()){
            System.out.println("\nAssento ocupado");
        } else {
            reserve.get(idSeat).setOccupied(true);
        }
    }

    public void toEmbark(){
        this.setEmbarked(true);
    }

    public String pray(){
        return "\nPai nosso........";
    }

    @Override
    public String toString() {
        return "Nome: " +this.getName()+ " | CPF: " +this.getCpf()+ " | Nascimento: " +this.getBirth()+ " | Classe: " +this.getTipe_service()+ " | Embarcado: " +getEmbarked();
    } 
}
