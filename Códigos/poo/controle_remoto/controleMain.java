package poo.controle_remoto;

public class controleMain {
    public static void main(String[] args) {
        controleRemoto c = new controleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.abrirMenu();
        c.desligar();
    }
}
