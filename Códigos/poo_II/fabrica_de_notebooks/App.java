package poo_II.fabrica_de_notebooks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        gerarNotebooks(3, "C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\fabrica_de_notebooks\\pecas.csv");
    }


    public static void gerarNotebooks(int num, String path) throws IOException{
        String linha = "";
        
        ArrayList<String> telas = new ArrayList<String>();
        ArrayList<String> processadores = new ArrayList<String>();
        ArrayList<String> armazenamentos = new ArrayList<String>();
        ArrayList<String> rams = new ArrayList<String>();
        ArrayList<String> placasDeVideo = new ArrayList<String>();
        ArrayList<String> teclados = new ArrayList<String>();
        ArrayList<String> marcas = new ArrayList<String>();
        ArrayList<String> slotsDeMemoria = new ArrayList<String>();
        ArrayList<String> sistemasOperacionais = new ArrayList<String>();
        ArrayList<String> cores = new ArrayList<String>();
        ArrayList<String> placasMae = new ArrayList<String>();
        ArrayList<String> carcacas = new ArrayList<String>();
        ArrayList<String> webcans = new ArrayList<String>();
        
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
                marcas.add(item[6]);
                slotsDeMemoria.add(item[7]);
                sistemasOperacionais.add(item[8]);
                cores.add(item[9]);
                placasMae.add(item[10]);
                carcacas.add(item[11]);
                webcans.add(item[12]);
            }

            int n = num;
            ArrayList<Notebook> notebooks = new ArrayList<>();

            for(int i = 0; i < n; i++){ // gera n notebooks aleátorios
                Random rand = new Random();

                String tela = telas.get(rand.nextInt(telas.size()));
                String processador = processadores.get(rand.nextInt(processadores.size()));
                String armazenamento = armazenamentos.get(rand.nextInt(armazenamentos.size()));
                String ram = rams.get(rand.nextInt(rams.size()));
                String placaDeVideo = placasDeVideo.get(rand.nextInt(placasDeVideo.size()));
                String teclado = teclados.get(rand.nextInt(teclados.size()));
                String marca = marcas.get(rand.nextInt(marcas.size()));
                String slotDeMemoria = slotsDeMemoria.get(rand.nextInt(slotsDeMemoria.size()));
                String sistemaOperacional = sistemasOperacionais.get(rand.nextInt(sistemasOperacionais.size()));
                String cor = cores.get(rand.nextInt(cores.size()));
                String placaMae = placasMae.get(rand.nextInt(placasMae.size()));
                String carcaca = carcacas.get(rand.nextInt(carcacas.size()));
                String webcam = webcans.get(rand.nextInt(webcans.size()));

                Notebook notebook = new Notebook(tela, processador, armazenamento, ram, placaDeVideo, teclado, marca, slotDeMemoria, sistemaOperacional, cor, placaMae, carcaca, webcam);

                notebooks.add(notebook);
            }

            int count = 1;
            for (Notebook item : notebooks) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n" + "-".repeat(49));
                sb.append("\n|" + " ".repeat(18) + "Notebook  " +count+ " ".repeat(18) + "|");
                sb.append("\n" + "-".repeat(49));
                System.out.println(sb.toString() + item);
                count++;
            }

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Arquivo não encontrado: " + e.getMessage());
        }
    }
}

