package poo.jornal_desportivo;

import java.util.ArrayList;
//import java.util.Collections;

import poo.jornal_desportivo.rodada.Rodada;

public class Campeonato implements Interface{

  private int idCamp;
  private int anoCamp;
  private String nomeCamp;
  private String tipoC;
  private ArrayList<Rodada> rodadas;

  
  public Campeonato(int idCamp, int anoCamp, String nomeCamp, String tipoC, ArrayList<Rodada> rodadas) {
    this.idCamp = idCamp;
    this.anoCamp = anoCamp;
    this.nomeCamp = nomeCamp;
    this.tipoC = tipoC;
    this.rodadas = rodadas;
  }


  public int getIdCamp() {
    return idCamp;
  }

  public void setIdCamp(int idCamp) {
    this.idCamp = idCamp;
  }

  public int getAnoCamp() {
    return anoCamp;
  }

  public void setAnoCamp(int anoCamp) {
    this.anoCamp = anoCamp;
  }

  public String getNomeCamp() {
    return nomeCamp;
  }

  public void setNomeCamp(String nomeCamp) {
    this.nomeCamp = nomeCamp;
  }

  public String getTipoC() {
    return tipoC;
  }

  public void setTipoC(String tipoC) {
    this.tipoC = tipoC;
  }

  public ArrayList<Rodada> getRodadas() {
    return rodadas;
  }

  public void setRodadas(ArrayList<Rodada> rodadas) {
    this.rodadas = rodadas;
  }
  
  // Métodos
  @Override
  public void exibirClassif(){
    /*List<String> classif = new ArrayList<>();
    String temp = new String();
    for(int i = 0; i < equipes.size(); i++){
      temp = equipes.get(i).getQtdPontos() + " :: " + equipes.get(i).getNome();
      classif.add(temp);
    }
    Collections.sort(classif, Collections.reverseOrder()); 
    System.out.println("\n\nClassificação:\n");
    for(int i = 0; i < classif.size(); i++){
      System.out.println(classif.get(i));
    }    */
  }

  @Override
  public String consultarCamp(ArrayList<Campeonato> campeonatos, int idCamp) {
    String text = null;
    for (Campeonato camps : campeonatos) {
        if (this.idCamp == idCamp) {
          text = camps.toString(); 
        } else {
          text = "Campeonato não encontrado";
        }
    }
    return text;
  }

  @Override
  public String exibirProgramacao() {
    return "\nRodadas: " +rodadas;
  }

  @Override
  public String toString() {
    return "ID: " +idCamp+ " | Campeonato " +nomeCamp+ "\nAno: " +anoCamp+ "\nTipo: " +tipoC+ "\nRodadas: " +rodadas;
  }
}
