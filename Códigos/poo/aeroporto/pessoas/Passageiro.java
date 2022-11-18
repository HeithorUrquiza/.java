package poo.aeroporto.pessoas;

import java.util.ArrayList;

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

    public boolean isEmbarked() {
        return embarked;
    }

    public void setEmbarked(boolean embarked) {
        this.embarked = embarked;
    }

    
    //Métodos
    public void toReserveSeat(String idSeat, ArrayList<Assento> seats){
        int i = 0;
        int num = seats.size();
        while (num != 0) {
            if (idSeat.equals(seats.get(i).getId()) && seats.get(i).getOccupied() == false){
                seats.get(i).setOccupied(true);
                this.setSeat(seats.get(i));
            }
            num -= 1;
        }
    }

    public void toEmbark(){
        this.setEmbarked(true);
    }

    public String pray(){
        return "";
    }

    @Override
    public String toString() {
        return "Nome: " +this.getName()+ " | CPF: " +this.getCpf()+ " | Nascimento: " +this.getBirth()+ " | Classe: " +this.getTipe_service();
    } 
}
