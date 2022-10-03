package poo.conta_banc;

public class ContaBMain {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumConta(111);
        c1.setDono("João");
        c1.abrirConta("CC");
        c1.depositar(120.00);
        c1.sacar(130.00);
        c1.pgMensal();
        c1.sacar(28.00);
        c1.fecharConta();
        c1.showStatus();
    }
}
