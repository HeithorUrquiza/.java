package poo.prova_final_visio;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        Manipulator control = new Manipulator();
        control.reader("C:/Users/heith/OneDrive/Documentos/Visio.txt");
        control.createPizzaGrafic();

        System.out.println(control.toString());

        
    }
}
