package poo.prova_final_visio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        
        Manipulator control = new Manipulator();
        control.reader("C:/Users/heith/OneDrive/Documentos/Visio.txt");



        /*BufferedReader br = new BufferedReader(new FileReader("C:/Users/heith/OneDrive/Documentos/Visio.txt"));
        String line = "";
        int os = 0;
        while(true){
            if (line != null){
                System.out.println(line);
                /*String[] words = line.split("\s");
                for (String sepWords : words) {
                    System.out.println(sepWords);
                    if (sepWords.compareToIgnoreCase("os") == 0) {
                        os += 1;
                    }
                }
            } else {
                break;
            }
            line = br.readLine();
        }
        System.out.println(os);
        br.close();*/
    }
}
