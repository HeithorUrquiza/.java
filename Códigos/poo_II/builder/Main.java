package poo_II.builder;

import java.util.ArrayList;
import java.util.Scanner;

import poo_II.builder.builders.Console;
import poo_II.builder.builders.ConsoleBuilder;
import poo_II.builder.builders.PS5Console;
import poo_II.builder.builders.XBOXConsole;
import poo_II.builder.director.Director;

public class Main {

    public static ConsoleBuilder ps5(int config) throws Exception{
        ConsoleBuilder ps5 = new PS5Console();
        
        if (config == 1) {
            Director director = new Director(ps5);
            director.constructConsole("C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\builder\\docs\\ps5.csv", config);
        }

        return ps5;
    }


    public static void main(String[] args) throws Exception {

        ConsoleBuilder console = ps5(1);
        System.out.println(console.toString());
                
        /*ConsoleBuilder consoleBuilder = new PS5Console();
        Director director = new Director(consoleBuilder);

        director.constructConsole("C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\builder\\docs\\xbox.csv", 1);

        System.out.println(consoleBuilder.toString());*/
    }
}
