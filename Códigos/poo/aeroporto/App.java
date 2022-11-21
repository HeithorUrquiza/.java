package poo.aeroporto;

import java.util.ArrayList;

import poo.aeroporto.aeronave.Aeronave;
import poo.aeroporto.aeronave.Assento;
import poo.aeroporto.aeronave.Modelo;
import poo.aeroporto.pessoas.Aeromoca;
import poo.aeroporto.pessoas.Passageiro;
import poo.aeroporto.pessoas.Piloto;
import poo.aeroporto.pessoas.Tipo_servico;
import poo.aeroporto.voos.Voo;

public class App {
    public static void main(String[] args) {


        ArrayList<Assento> seats = new ArrayList<>();
        seats.add(new Assento("A-1", false));
        seats.add(new Assento("B-1", false));
        seats.add(new Assento("C-1", false));

        //---------------------------------------------- 
        //PERMISSÕES
        ArrayList<String> permitions1 = new ArrayList<>();
        permitions1.add(Modelo.AIRBUS_319.getModel());
        permitions1.add(Modelo.BOEING_787.getModel());
        permitions1.add(Modelo.BOEING_757.getModel());
        permitions1.add(Modelo.ATR_42_500.getModel());

        ArrayList<String> permitions2 = new ArrayList<>();
        permitions2.add(Modelo.AIRBUS_320_200.getModel());
        permitions2.add(Modelo.BOEING_767.getModel());
        permitions2.add(Modelo.BOEING_767_300ER.getModel());
        permitions2.add(Modelo.AIRBUS_320.getModel());
        
        //---------------------------------------------- 
        //AERONAVE
        ArrayList<Aeronave> aircraf = new ArrayList<>();
        aircraf.add(new Aeronave(177, Modelo.BOEING_787.getModel(), seats, seats.size(), "Azul"));
        
        //---------------------------------------------- 
        //PASSAGEIROS
        ArrayList<Passageiro> passengers1 = new ArrayList<>();
        passengers1.add(new Passageiro("Osvaldo", "1111", "12/01/1987", Tipo_servico.ECONOMIC.getType()));
        passengers1.add(new Passageiro("Cintia", "2222", "14/08/1987", Tipo_servico.FIRST.getType()));
        passengers1.add(new Passageiro("Frederico", "3333", "12/02/1987", Tipo_servico.EXECUTIVE.getType()));

        //---------------------------------------------- 
        //PILOTO
        ArrayList<Piloto> pilots = new ArrayList<>();
        pilots.add(new Piloto("Eduardo", "1234", "15/09/1980", 1, false, 2000, permitions1));
        pilots.add(new Piloto("Afonso", "4321", "05/10/1982", 2, true, 1200, permitions1));

        //---------------------------------------------- 
        //AEROMOCA
        ArrayList<Aeromoca> steward = new ArrayList<>();
        steward.add(new Aeromoca("Carla", "4517", "02/01/1990", 1));

        //---------------------------------------------- 
        //VOO
        ArrayList<Voo> flights = new ArrayList<>();
        flights.add(new Voo(1, pilots.get(0), pilots.get(1), steward.get(0), passengers1, aircraf.get(0), "Goiânia", "Recife", "18:00", "22:30", "14/12/2022"));


        
    }
}
