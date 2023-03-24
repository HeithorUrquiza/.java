package poo_II.builder;

import java.util.ArrayList;
import java.util.Scanner;

import poo_II.builder.builders.ConsoleBuilder;
import poo_II.builder.builders.PS5Console;
import poo_II.builder.builders.XBOXConsole;
import poo_II.builder.director.Director;

public class Main {
    public static ArrayList<String> configurarBuilder(){
        
        ArrayList<String> resps = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tipo de console: " + "\n>> ");
        resps.add(input.nextLine());

        System.out.print("\nEscolha a configuração [ 1 | 2 | 3 ]" + "\n>> ");
        resps.add(input.nextLine());

        input.close();
        
        return resps; 
    }

    public static void encerrar(){

        String resp = "";
        Scanner input = new Scanner(System.in);

        System.out.print("\nResetar console: [ S / N ]" + "\n>> ");
        resp = input.nextLine();

        if (resp.toUpperCase().equals("S")) {
            System.exit(0);
        } else {
            System.out.println("\n");
        }

        input.close();
    }

    public static void main(String[] args) throws Exception {
        
        Director director;
        ConsoleBuilder console;

        do {
            ArrayList<String> config = configurarBuilder();

            if(config.get(0).toUpperCase().equals("PS5")){

                int tipoConfig = Integer.parseInt(config.get(1));
                console = new PS5Console();
                director = new Director(console);
                
                director.constructConsole("C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\builder\\docs\\ps5.csv", tipoConfig);

                encerrar();
                director.resetConsole();

            } else if (config.get(0).toUpperCase().equals("XBOX")){
                
                int tipoConfig = Integer.parseInt(config.get(1));
                console = new XBOXConsole();
                director = new Director(console);
                
                director.constructConsole("C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\builder\\docs\\xbox.csv", tipoConfig);

                encerrar();
                director.resetConsole();
            }
            
        } while (!false);
    }
}
