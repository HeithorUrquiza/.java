package poo.prova_final_visio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    
    // Função que lê o arquivo e conta as ocorrências
    public void reader(String path) throws IOException{
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            try {
                while(true){
                    if (line != null){
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
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!!");
            }
        } catch (FileNotFoundException ex) {
        System.out.println("Erro: Arquivo não encontrado!!");
        }
    }

    //Gera um gráfico Pizza modelo 3D
    public void createPizzaGrafic(){
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


    @Override
    public String toString() {
        return "\nRespectiva quantidade de Artigos e Pronomes no poema:\n\nO: " + artO + "\n-------\nA: " + artA + "\n-------\nOs: " + artOs + "\n-------\nAs: " + artAs + "\n-------\nTeu: " + proTeu + "\n-------\nTeus: " + proTeus + "\n-------\nNossas: " + proNossas + "\n-------\nMeus: " + proMeus + "\n-------\nTu: "+ proTu+ "\n";
    }    
}
