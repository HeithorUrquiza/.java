package poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks.GigabyteNotebook;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks.Notebook;

public class GigabyteFabrica implements FabricaNotebook{

    @Override
    public Notebook criarNotebook(String path) {
        String linha = "";
        
        ArrayList<String> telas = new ArrayList<String>();
        ArrayList<String> processadores = new ArrayList<String>();
        ArrayList<String> armazenamentos = new ArrayList<String>();
        ArrayList<String> rams = new ArrayList<String>();
        ArrayList<String> placasDeVideo = new ArrayList<String>();
        ArrayList<String> teclados = new ArrayList<String>();
        ArrayList<String> slotsDeMemoria = new ArrayList<String>();
        ArrayList<String> sistemasOperacionais = new ArrayList<String>();
        ArrayList<String> cores = new ArrayList<String>();
        ArrayList<String> placasMae = new ArrayList<String>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            br.readLine(); // ignora a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) { // lê cada linha do arquivo

                String[] item = linha.split(","); // separa os campos utilizando o separador e preenche os arrays
                telas.add(item[0]);
                processadores.add(item[1]);
                armazenamentos.add(item[2]);
                rams.add(item[3]);
                placasDeVideo.add(item[4]);
                teclados.add(item[5]);
                slotsDeMemoria.add(item[6]);
                sistemasOperacionais.add(item[7]);
                cores.add(item[8]);
                placasMae.add(item[9]);
            }

            Random rand = new Random();
            GigabyteNotebook gigabyte = new GigabyteNotebook();

            gigabyte.setTela(telas.get(rand.nextInt(telas.size()))); 
            gigabyte.setProcessador(processadores.get(rand.nextInt(processadores.size()))); 
            gigabyte.setArmazenamento(armazenamentos.get(rand.nextInt(armazenamentos.size()))); 
            gigabyte.setRam(rams.get(rand.nextInt(rams.size())));
            gigabyte.setPlacaDeVideo(placasDeVideo.get(rand.nextInt(placasDeVideo.size())));
            gigabyte.setTeclado(teclados.get(rand.nextInt(teclados.size()))); 
            gigabyte.setSlotDisponivel(slotsDeMemoria.get(rand.nextInt(slotsDeMemoria.size()))); 
            gigabyte.setSistemaOperacional(sistemasOperacionais.get(rand.nextInt(sistemasOperacionais.size()))); 
            gigabyte.setCor(cores.get(rand.nextInt(cores.size()))); 
            gigabyte.setPlacaMae(placasMae.get(rand.nextInt(placasMae.size())));
            
            return gigabyte;
        
        } catch (Exception e) {
            return (Notebook) e;
        }
    }
    
}
