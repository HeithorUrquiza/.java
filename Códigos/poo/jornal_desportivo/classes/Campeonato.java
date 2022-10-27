package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Pessoas.Arbitro;
import classes.Pessoas.Equipe;
import classes.Rodada.Rodada;

public class Campeonato implements Interface{

  private int idCamp;
  private int anoCamp;
  private String nomeCamp;
  private TipoCampeonato tipoC;
  private List<Rodada> rodadas = new ArrayList<Rodada>();
  private List<Equipe> equipes = new ArrayList<Equipe>();
  List<Arbitro> arbtr = new ArrayList<>();

  
  public Campeonato(int idCamp, int anoCamp, String nomeCamp, TipoCampeonato tipoC) {
    this.idCamp = idCamp;
    this.anoCamp = anoCamp;
    this.nomeCamp = nomeCamp;
    this.tipoC = tipoC;
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
  public TipoCampeonato getTipoC() {
    return tipoC;
  }
  public void setTipoC(TipoCampeonato tipoC) {
    this.tipoC = tipoC;
  }
  public List<Rodada> getRodadas() {
    return rodadas;
  }
  public void setRodadas(List<Rodada> rodadas) {
    this.rodadas = rodadas;
  }
  
  public void adicionarEquipe(String nome, int qtdPontos, int vitorias, int derrotas){
    Equipe eqp = new Equipe(nome, qtdPontos, vitorias, derrotas);
    equipes.add(eqp);
  }

  public void adicionarRodadas(int numRodada, int anoRodada){
    Rodada rodada = new Rodada(numRodada, anoRodada);
    rodadas.add(rodada);
  }

  public void adicionarArbitro(String nome, String cargo){
    Arbitro arb = new Arbitro(nome, cargo);
    arbtr.add(arb);
  }

  public void consultarRod(int numRodada){
    int temp = 0;
    for(int j = 0; j < rodadas.size(); j++){
      if(rodadas.get(j).getNumRodada() == numRodada){
        System.out.println("\nAno: " + rodadas.get(j).getAnoRodada());
        System.out.println("Número de Identificação: " + rodadas.get(j).getNumRodada());
        System.out.println("Número de Jogos: " + rodadas.get(0).jogo.size() + "\n");
        temp = j;
      }
    }
    for(int i = 0; i < rodadas.get(temp).jogo.size(); i ++){
      System.out.println("\n -=-=-=-=" + (i + 1) + "=-=-=-=-");
      System.out.println("Data: " + rodadas.get(temp).jogo.get(i).getData());
      System.out.println("Local: " + rodadas.get(temp).jogo.get(i).getLocal());
      System.out.println("Árbitro: " + rodadas.get(temp).jogo.get(i).getArbitro().getNome());
      System.out.println("Visitante: " + rodadas.get(temp).jogo.get(i).getVisitante().getNome());
      System.out.println("Visitado: " + rodadas.get(temp).jogo.get(i).getVisitado().getNome());
    }
  }

  @Override
  public void exibirClassif(){
    List<String> classif = new ArrayList<>();
    String temp = new String();
    for(int i = 0; i < equipes.size(); i++){
      temp = equipes.get(i).getQtdPontos() + " :: " + equipes.get(i).getNome();
      classif.add(temp);
    }
    Collections.sort(classif, Collections.reverseOrder()); 
    System.out.println("\n\nClassificação:\n");
    for(int i = 0; i < classif.size(); i++){
      System.out.println(classif.get(i));
    }

    
  }
  public List<Equipe> getEquipes() {
    return equipes;
  }
  public void setEquipes(List<Equipe> equipes) {
    this.equipes = equipes;
  }
  public List<Arbitro> getArbtr() {
    return arbtr;
  }
  public void setArbtr(List<Arbitro> arbtr) {
    this.arbtr = arbtr;
  }

  
}
