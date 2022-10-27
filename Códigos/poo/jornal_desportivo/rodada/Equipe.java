package poo.jornal_desportivo.rodada;

import java.util.ArrayList;

import poo.jornal_desportivo.pessoas.Tecnico;
import poo.jornal_desportivo.TipoCampeonato;
import poo.jornal_desportivo.pessoas.Jogador;

public class Equipe {

  private String nome;
  private TipoCampeonato divisao;
  private int qtdPontos;
  private int vitorias;
  private int derrotas;
  private Tecnico tecnico;
  private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();


  public Equipe(String nome, TipoCampeonato divisao) {
    this.nome = nome;
    this.divisao = divisao;
    this.qtdPontos = 15;
    this.vitorias = 0;
    this.derrotas = 0;
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

  public ArrayList<Jogador> getJogadores() {
    return jogadores;
  }

  public void setJogadores(ArrayList<Jogador> jogadores) {
    this.jogadores = jogadores;
  }


  public void adicionarTecnico(String nome, String funcao){
    Tecnico tec = new Tecnico(nome, funcao);
    System.out.println("Foi definido que " + tec.getNome() + " é o atual técnico da equipe " + this.nome);
  }
  
  public void adicionarJogador(String nome, String nacionalidade, String posicao, boolean titular){
    Jogador base = new Jogador(nome, nacionalidade, posicao, titular);
    jogadores.add(base);
    System.out.println("Jogador " + base.getNome() + " entrou pelo " + this.nome);
  }
}
