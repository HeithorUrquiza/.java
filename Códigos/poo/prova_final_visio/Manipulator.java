package poo.prova_final_visio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Manipulator extends JFrame{

    private int artO;
    private int artA;
    private int artOs;
    private int artAs;
    private int proTeu;
    private int proTeus;
    private int proNossas;
    private int proMeus;
    private int proTu;
    private boolean read;
    private String seach;
    

    public Manipulator() {
        super("Gráfico do Poema Visio");
        this.artO = 0;
        this.artA = 0;
        this.artOs = 0;
        this.artAs = 0;
        this.proTeu = 0;
        this.proTeus = 0;
        this.proNossas = 0;
        this.proMeus = 0;
        this.proTu = 0;
        this.read = false;
        this.seach = "";
    }


    public int getArtO() {
        return artO;
    }

    public void setArtO(int artO) {
        this.artO = artO;
    }

    public int getArtA() {
        return artA;
    }

    public void setArtA(int artA) {
        this.artA = artA;
    }

    public int getArtOs() {
        return artOs;
    }

    public void setArtOs(int artOs) {
        this.artOs = artOs;
    }

    public int getArtAs() {
        return artAs;
    }

    public void setArtAs(int artAs) {
        this.artAs = artAs;
    }

    public int getProTeu() {
        return proTeu;
    }

    public void setProTeu(int proTeu) {
        this.proTeu = proTeu;
    }

    public int getProTeus() {
        return proTeus;
    }

    public void setProTeus(int proTeus) {
        this.proTeus = proTeus;
    }

    public int getProNossas() {
        return proNossas;
    }

    public void setProNossas(int proNossas) {
        this.proNossas = proNossas;
    }

    public int getProMeus() {
        return proMeus;
    }

    public void setProMeus(int proMeus) {
        this.proMeus = proMeus;
    }

    public int getProTu() {
        return proTu;
    }

    public void setProTu(int proTu) {
        this.proTu = proTu;
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getSeach() {
        return seach;
    }

    public void setSeach(String seach) {
        this.seach += seach + "\n";
    }
    

    // Função que lê o arquivo e conta as ocorrências
    public void reader(String path) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            try {
                while(true){
                    if (line != null){
                        this.setSeach(line);
                        String[] words = line.split("\s");
                        for (String word : words) {
                            if (word.compareToIgnoreCase("os") == 0){
                                this.setArtOs(this.getArtOs() + 1);
                            }
                            if (word.compareToIgnoreCase("as") == 0){
                                this.setArtAs(this.getArtAs() + 1);
                            }
                            if (word.compareToIgnoreCase("o") == 0){
                                this.setArtO(this.getArtO() + 1);
                            }
                            if (word.compareToIgnoreCase("a") == 0){
                                this.setArtA(this.getArtA() + 1);
                            }
                            if (word.compareToIgnoreCase("teu") == 0){
                                this.setProTeu(this.getProTeu() + 1);
                            }
                            if (word.compareToIgnoreCase("teus") == 0){
                                this.setProTeus(this.getProTeus() + 1);
                            }
                            if (word.compareToIgnoreCase("meus") == 0){
                                this.setProMeus(this.getProMeus() + 1);
                            }
                            if (word.compareToIgnoreCase("nossas") == 0){
                                this.setProNossas(this.getProNossas() + 1);
                            }
                            if (word.compareToIgnoreCase("tu") == 0){
                                this.setProTu(this.getProTu() + 1);
                            }
                        }
                    } else {
                        break;
                    }
                    line = br.readLine();
                }
                br.close();
                this.setRead(true);
            } catch (IOException ex) {
                System.out.println("\nErro: Não foi possível ler o arquivo!!");
            }
        } catch (FileNotFoundException ex) {
        System.out.println("\nErro: Arquivo não encontrado!!");
        }
    }

    //Gera um gráfico Pizza modelo 3D
    public void createPizzaGrafic(){
        if (this.getRead()){
            DefaultPieDataset pieDataset = new DefaultPieDataset(); //Similar ao HashMap consiste em uma relação chave-valor para o gráfico
            pieDataset.setValue(" O ", this.getArtO());
            pieDataset.setValue(" A ", this.getArtA());
            pieDataset.setValue(" Os ", this.getArtOs());
            pieDataset.setValue(" As ", this.getArtAs());
            pieDataset.setValue(" Teu ", this.getProTeu());
            pieDataset.setValue(" Teus ", this.getProTeus());
            pieDataset.setValue(" Nossas ", this.getProNossas());
            pieDataset.setValue(" Meus ", this.getProMeus());
            pieDataset.setValue(" Tu ", this.getProTu());

            JFreeChart grafic = ChartFactory.createPieChart3D("Quantidade de Artigos e Pronomes", pieDataset, true, true, true); //Cria o gráfico

            this.add(new ChartPanel(grafic));

            this.pack();
            this.setVisible(true);
        }
    }

    //Realiza a pesquisa por ocorrência de uma string
    public int stringCounter(String file, String word){
        String fileL = file.toLowerCase();
        String wordL = word.toLowerCase();
        int occurences = 0;
        String res = "";
          for(int i = 0; i < file.length() - word.length(); i++){
            for(int j = 0; j < word.length(); j++){
              res += fileL.charAt(i + j);
            }
            if(res.equals(wordL)){
              occurences += 1;
            }
            res = "";
          }
    
        return occurences;
    }


    public void manipulate(String archive) throws IOException{
        this.reader(archive);
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.print("\nEscolha uma ação: \n[1] Gerar gráfico do arquivo \n[2] Exibir conteúdo do arquivo \n[3] Pesquisar ocorrência(s) de uma palavra \n[0] Encerrar programa \n -->  ");
                int answer = sc.nextInt();

                switch (answer) {
                    case 1:
                        this.createPizzaGrafic();
                        System.out.println(this.toString());
                        break;            
                    case 2:
                        System.out.println(this.getSeach());
                        break;
                    case 3:
                        Scanner sc2 = new Scanner(System.in);
                        System.out.print("\nPalavra a ser pesquisada: ");
                        String word = sc2.nextLine();
                        System.out.println("\nOcorrência(s) -> " + this.stringCounter(this.getSeach(), word));
                        break;
                    case 0:
                        return;
                        
                }

                System.out.println("\n-------------------------------------------------------");
            }
        }        
    }


    @Override
    public String toString() {
        String msg = "";
        if (this.getRead()) {
            msg = "\nRespectiva quantidade de Artigos e Pronomes no poema:\n\nO: " + artO + "\n-------\nA: " + artA + "\n-------\nOs: " + artOs + "\n-------\nAs: " + artAs + "\n-------\nTeu: " + proTeu + "\n-------\nTeus: " + proTeus + "\n-------\nNossas: " + proNossas + "\n-------\nMeus: " + proMeus + "\n-------\nTu: "+ proTu+ "\n";
        }
        return msg;
    }
}
