package poo_II.facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SimuladorDeVooFacade si = new SimuladorDeVooFacade();

        si.inicarSimulador();
        si.decolar();
        si.voar();
        si.pousar();
        si.encerrarSimulador();
    }
}
