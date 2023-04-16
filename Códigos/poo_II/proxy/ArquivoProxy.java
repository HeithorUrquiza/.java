package poo_II.proxy;

public class ArquivoProxy implements InterfaceArquivo{
    private String nome;
    private ArquivoReal arquivoReal;

    public ArquivoProxy(String nome) {
        this.nome = nome;
    }

    public void ler() {
        if (arquivoReal == null) {
            arquivoReal = new ArquivoReal(nome);
        }
        
        arquivoReal.ler();
    }
}
