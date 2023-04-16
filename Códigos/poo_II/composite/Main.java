package poo_II.composite;

public class Main {
    public static void main(String[] args) {
        Componente folha1 = new Folha("Conteúdo da folha 1.");
        Componente folha2 = new Folha("Conteúdo da folha 2.");

        Documento documento = new Documento();
        documento.adicionar(folha1);
        documento.adicionar(folha2);

        Componente folha3 = new Folha("Conteúdo da folha 3.");

        Documento documento2 = new Documento();
        documento2.adicionar(documento);
        documento2.adicionar(folha3);

        documento2.imprimir();
    }
}
