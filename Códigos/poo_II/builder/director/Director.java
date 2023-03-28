package poo_II.builder.director;

import poo_II.builder.builders.ConsoleBuilder;

public class Director {
    
    private ConsoleBuilder consoleBuilder;


    public Director(ConsoleBuilder consoleBuilder){
        this.consoleBuilder = consoleBuilder;
    }

    public void constructConsole(String tipoConsole, int config) {
        if(tipoConsole.toLowerCase().equals("ps5") && config == 1){
            consoleBuilder.buildPlacaDeVideo("GeForce RTX 2060");
            consoleBuilder.buildCPU("Ryzen 9 5900X");
            consoleBuilder.buildArmazenamento("WD_Black SN850 NVMe SSD 2TB");
            consoleBuilder.buildRam("Kingston HyperX Fury 32GB DDR4 3200MHz");

        } else if(tipoConsole.toLowerCase().equals("ps5") && config == 2){
            consoleBuilder.buildPlacaDeVideo("Radeon RX 6800 XT");
            consoleBuilder.buildCPU("Core i7-11700K");
            consoleBuilder.buildArmazenamento("Seagate Expansion Card SSD 1TB");
            consoleBuilder.buildRam("Corsair Vengeance LPX 16GB DDR4 3200MHz");

        } else {
            resetConsole();
            System.out.println("\nConsole e/ou configuração indisponíveis!!");
        }
    }

    public void resetConsole(){
        consoleBuilder.reset();
    }
}

