package poo.aeroporto.pessoas;

import poo.aeroporto.voos.Assento;

public class Passageiros extends Pessoa{
    
    private Assento seat;
    private String tipe_service;
    private boolean embarked;


    //Construtor
    public Passageiros(String name, String cpf, String birth, Assento seat, String tipe_service, boolean embarked) {
        super(name, cpf, birth);
        this.seat = seat;
        this.tipe_service = tipe_service;
        this.embarked = embarked;
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

    

}
