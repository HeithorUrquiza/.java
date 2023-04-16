package poo_II.proxy;

public class ArquivoReal implements InterfaceArquivo{
    private String nome;

    public ArquivoReal(String nome) {
        this.nome = nome;
        carregarArquivo();
    }

    private void carregarArquivo() {
        System.out.println("Carregando o arquivo " + nome);
    }

    public void ler() {
        System.out.println("Lendo o arquivo " + nome);
    }
}
