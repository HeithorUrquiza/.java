package poo_II.proxy;

public class Main {
    public static void main(String[] args) {
        InterfaceArquivo arquivo = new ArquivoProxy("documento.txt");
        
        arquivo.ler();
    }
}

