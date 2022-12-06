package poo.prova_final_visio;

import java.io.IOException;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Manipulator control = new Manipulator();
        control.manipulate("C:/Users/heith/OneDrive/Documentos/Visio.txt");

        /*control.reader("C:/Users/heith/OneDrive/Documentos/Visio.txt");
        control.createPizzaGrafic();

        System.out.println(control.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPalavra a ser pesquisada: ");
        String word = sc.nextLine();
        System.out.println("Ocorrência(s) -> " + control.stringCounter(control.getSeach(), word));
        sc.close();*/
    }
}
