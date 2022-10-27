package classes.Pessoas;

import java.util.ArrayList;
import java.util.List;

import classes.TipoCampeonato;

public class Equipe {

  private String nome;
  private TipoCampeonato divisao;
  private int qtdPontos;
  private int vitorias;
  private int derrotas;
  private Tecnico tecnico;
  public List<Jogador> jogadores = new ArrayList<>();

  public Equipe(String nome, int qtdPontos, int vitorias, int derrotas) {
    this.nome = nome;
    this.qtdPontos = qtdPontos;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public TipoCampeonato getDivisao() {
    return divisao;
  }
  public void setDivisao(TipoCampeonato divisao) {
    this.divisao = divisao;
  }
  public int getQtdPontos() {
    return qtdPontos;
  }
  public void setQtdPontos(int qtdPontos) {
    this.qtdPontos = qtdPontos;
  }
  public int getVitorias() {
    return vitorias;
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
  public int getDerrotas() {
    return derrotas;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public Tecnico getTecnico() {
    return tecnico;
  }
  public void setTecnico(Tecnico tecnico) {
    this.tecnico = tecnico;
  }

  public void adicionarTecnico(String nome){
    Tecnico tec = new Tecnico(nome);
    System.out.println("Foi definido que " + tec.getNome() + " é o atual técnico da equipe " + this.nome);
  }
  
  public void adicionarJogador(String nome, String nacionalidade, String posicao, boolean titular){
    Jogador base = new Jogador(nome, nacionalidade, posicao, titular);
    jogadores.add(base);
    System.out.println("Jogador " + base.getNome() + " entrou pelo " + this.nome);
  }

}
