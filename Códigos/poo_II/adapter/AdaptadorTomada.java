package poo_II.adapter;

public class AdaptadorTomada extends TomadaBrasileira {
    private TomadaAmericana tomadaAmericana;
    
    public AdaptadorTomada(TomadaAmericana tomadaAmericana) {
        this.tomadaAmericana = tomadaAmericana;
    }
    
    public void conectar() {
        tomadaAmericana.plugIn();
    }
}
