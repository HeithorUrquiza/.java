package poo_II.facade.sistemas;

import poo_II.facade.SimuladorDeVooFacade;

public class TesteSound {
    public static void main(String[] args) throws InterruptedException {
        SimuladorDeVooFacade si = new SimuladorDeVooFacade();

        si.inicarSimulador();
        si.decolar();
        si.voar();
        si.pousar();
        si.encerrarSimulador();
    }
}
