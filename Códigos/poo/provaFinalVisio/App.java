package poo.provaFinalVisio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        
        File arquivo = new File("C:/Users/heith/OneDrive/Documentos/Visio.txt");
        boolean existe = arquivo.exists();

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        String linha = br.readLine();

        System.out.println(existe);
        System.out.println(linha);

        fr.close();
        br.close();
    }
}
