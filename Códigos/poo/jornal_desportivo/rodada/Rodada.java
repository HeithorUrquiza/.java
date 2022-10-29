package poo.jornal_desportivo.rodada;

import java.util.ArrayList;

public class Rodada {

  private int numRodada;
  private int anoRodada;
  private ArrayList<Jogo> jogos;
  

  public Rodada(int numRodada, int anoRodada, ArrayList<Jogo> jogos) {
    this.numRodada = numRodada;
    this.anoRodada = anoRodada;
    this.jogos = jogos;
  }


  public int getNumRodada() {
    return numRodada;
  }
  
  public void setNumRodada(int numRodada) {
    this.numRodada = numRodada;
  }

  public int getAnoRodada() {
    return anoRodada;
  }

  public void setAnoRodada(int anoRodada) {
    this.anoRodada = anoRodada;
  }

  public ArrayList<Jogo> getJogos() {
    return jogos;
  }

  public void setJogos(ArrayList<Jogo> jogos) {
    this.jogos = jogos;
  }


  public void consultarRodada(ArrayList<Rodada> rodadas, int numRodada){
    for(Rodada rods: rodadas){
      if(rods.getNumRodada() == numRodada){
        rods.toString();
      }
    }
  }

  @Override
  public String toString() {
    return "\nRodada ID: " +numRodada+ " | Ano: " +anoRodada+ "\nJogos: " +jogos+ "\n";
  }
}
