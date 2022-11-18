package poo.aeroporto;

import java.util.ArrayList;

import poo.aeroporto.aeronave.Assento;
import poo.aeroporto.pessoas.Passageiro;
import poo.aeroporto.pessoas.Tipo_servico;

public class App {
    public static void main(String[] args) {


        ArrayList<Assento> seats = new ArrayList<>();


        
        ArrayList<Passageiro> passengers1 = new ArrayList<>();
        passengers1.add(new Passageiro("Osvaldo", "1111", "12/01/1987", Tipo_servico.ECONOMIC.getType(), false));
        passengers1.add(new Passageiro("Cintia", "2222", "14/08/1987", Tipo_servico.FIRST.getType(), false));
        passengers1.add(new Passageiro("Frederico", "3333", "12/02/1987", Tipo_servico.EXECUTIVE.getType(), false));

        System.out.println(passengers1.toString());
    }
}
