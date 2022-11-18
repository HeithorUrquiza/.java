package poo.aeroporto;

import java.util.ArrayList;

import poo.aeroporto.aeronave.Aeronave;
import poo.aeroporto.aeronave.Assento;
import poo.aeroporto.aeronave.Modelo;
import poo.aeroporto.pessoas.Passageiro;
import poo.aeroporto.pessoas.Tipo_servico;

public class App {
    public static void main(String[] args) {


        ArrayList<Assento> seats = new ArrayList<>();
        seats.add(new Assento("A-1", false));
        seats.add(new Assento("B-1", false));
        seats.add(new Assento("C-1", false));
        
        //---------------------------------------------- 
        //AERONAVE
        ArrayList<Aeronave> aircraf = new ArrayList<>();
        aircraf.add(new Aeronave(177, Modelo.BOEING_787.getModel(), seats, seats.size(), true, "Azul"));
        
        //---------------------------------------------- 
        //PASSAGEIROS
        ArrayList<Passageiro> passengers1 = new ArrayList<>();
        passengers1.add(new Passageiro("Osvaldo", "1111", "12/01/1987", Tipo_servico.ECONOMIC.getType()));
        passengers1.add(new Passageiro("Cintia", "2222", "14/08/1987", Tipo_servico.FIRST.getType()));
        passengers1.add(new Passageiro("Frederico", "3333", "12/02/1987", Tipo_servico.EXECUTIVE.getType()));

        
    }
}
