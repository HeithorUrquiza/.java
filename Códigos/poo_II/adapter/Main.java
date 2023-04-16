package poo_II.adapter;

public class Main {
    public static void main(String[] args) {
        TomadaAmericana tomadaAmericana = new TomadaAmericana();
        TomadaBrasileira tomadaBrasileira = new AdaptadorTomada(tomadaAmericana);
        
        tomadaBrasileira.conectar();
    }
}

