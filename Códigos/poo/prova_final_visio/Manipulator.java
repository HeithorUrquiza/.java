package poo.prova_final_visio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manipulator {

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
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        while(true){
            if (line != null){
                String[] words = line.split("\s");
                for (String word : words) {
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                    if (word.compareToIgnoreCase("os") == 0){
                        this.setArtOs(this.getArtOs() + 1);
                    }
                }
            } else {
                break;
            }
            line = br.readLine();
        }
        System.out.println(this.getArtOs());
        br.close();
    }


    
}
