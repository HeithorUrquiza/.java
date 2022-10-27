package classes.Rodada;

import classes.Jogo.Jogo;
import classes.Pessoas.Arbitro;
import classes.Pessoas.Equipe;

import java.util.ArrayList;

public class Rodada {
  private int numRodada;
  private int anoRodada;
  public ArrayList<Jogo> jogo = new ArrayList<>();

  public Rodada(int numRodada, int anoRodada) {
    this.numRodada = numRodada;
    this.anoRodada = anoRodada;
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

  public void marcarJogo(Equipe equipeVisitante, Equipe equipeVisitada, String data, String local, Arbitro arb){
    Jogo novoJogo = new Jogo(data, local, arb, equipeVisitante, equipeVisitada);
    jogo.add(novoJogo);
  }
  
}
