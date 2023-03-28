package poo_II.builder;

import poo_II.builder.builders.ConsoleBuilder;
import poo_II.builder.builders.PS5Console;
import poo_II.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        ConsoleBuilder console = new PS5Console();
        Director director = new Director(console);

        director.constructConsole("ps5", 1);
        System.out.println(console);
        
        director.resetConsole();
        System.out.println(console);

        director.constructConsole("ps5", 2);
        System.out.println(console);

        director.constructConsole("ps5", 0);
        System.out.println(console);
    }   
}
