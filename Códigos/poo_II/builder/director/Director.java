package poo_II.builder.director;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import poo_II.builder.builders.ConsoleBuilder;

public class Director {
    
    private ConsoleBuilder consoleBuilder;


    public Director(ConsoleBuilder consoleBuilder){
        this.consoleBuilder = consoleBuilder;
    }


    public void constructConsole(String doc, int config) throws Exception{
        
        String linha = "";
        ArrayList<String> placasDeVideo = new ArrayList<String>();
        ArrayList<String> cpus = new ArrayList<String>();
        ArrayList<String> armazenamentos = new ArrayList<String>();
        ArrayList<String> rams = new ArrayList<String>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(doc))) {

            br.readLine(); // ignora a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) { // lê cada linha do arquivo

                String[] item = linha.split(","); // separa os campos utilizando o separador e preenche os arrays
                placasDeVideo.add(item[0]);
                cpus.add(item[1]);
                armazenamentos.add(item[2]);
                rams.add(item[3]);
            }

            switch (config) {
                case 1:
                    consoleBuilder.buildPlacaDeVideo(placasDeVideo.get(0));
                    consoleBuilder.buildCPU(cpus.get(0));
                    consoleBuilder.buildArmazenamento(armazenamentos.get(0));
                    consoleBuilder.buildRam(rams.get(0));
                    break;

                case 2:
                    consoleBuilder.buildPlacaDeVideo(placasDeVideo.get(1));
                    consoleBuilder.buildCPU(cpus.get(1));
                    consoleBuilder.buildArmazenamento(armazenamentos.get(1));
                    consoleBuilder.buildRam(rams.get(1));
                    break;

                case 3:
                    consoleBuilder.buildPlacaDeVideo(placasDeVideo.get(2));
                    consoleBuilder.buildCPU(cpus.get(2));
                    consoleBuilder.buildArmazenamento(armazenamentos.get(2));
                    consoleBuilder.buildRam(rams.get(2));
                    break;

                default:
                    throw new Exception("A configuração solicitada não consta no sistema");
            }

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }
    }

    public void resetConsole(){
        consoleBuilder.reset();
    }
}

