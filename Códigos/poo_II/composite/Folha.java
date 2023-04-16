package poo_II.composite;

public class Folha implements Componente {
    private String conteudo;

    public Folha(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        System.out.println(conteudo);
    }
}
