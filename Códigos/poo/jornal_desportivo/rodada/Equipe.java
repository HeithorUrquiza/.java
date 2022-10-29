package poo.jornal_desportivo.rodada;

import java.util.ArrayList;
import poo.jornal_desportivo.pessoas.Tecnico;
import poo.jornal_desportivo.Tipo;
import poo.jornal_desportivo.pessoas.Jogador;

public class Equipe implements Comparable<Equipe>{

  private String nome;
  private String divisao;
  private int qtdPontos;
  private int vitorias;
  private int derrotas;
  private Tecnico tecnico;
  private ArrayList<Jogador> jogadores;


  public Equipe(String nome, String divisao, Tecnico tecnico, ArrayList<Jogador> jogadores) {
    this.nome = nome;
    this.divisao = divisao;
    this.tecnico = tecnico;
    this.qtdPontos = 15;
    this.vitorias = 0;
    this.derrotas = 0;
    this.jogadores = jogadores;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDivisao() {
    return divisao;
  }

  public void setDivisao(String divisao) {
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


  public void promoverEquipe(){
    if (this.getDivisao().equals(Tipo.SEGUNDA_DIVISAO.getTipo()) && this.getQtdPontos() > 50) {
      this.setDivisao(Tipo.PRIMEIRA_DIVISAO.getTipo());
      this.setQtdPontos(10);
    } else if (this.getDivisao().equals(Tipo.PRIMEIRA_DIVISAO.getTipo()) && this.getQtdPontos() > 50) {
      this.setDivisao(Tipo.REGIONAL.getTipo());
      this.setQtdPontos(10);
    }
  }

  public void rebaixarEquipe(){
    if (this.getDivisao().equals(Tipo.REGIONAL.getTipo()) && this.getQtdPontos() < 10) {
      this.setDivisao(Tipo.PRIMEIRA_DIVISAO.getTipo());
      this.setQtdPontos(12);
    } else if (this.getDivisao().equals(Tipo.PRIMEIRA_DIVISAO.getTipo()) && this.getQtdPontos() < 10) {
      this.setDivisao(Tipo.SEGUNDA_DIVISAO.getTipo());
      this.setQtdPontos(12);
    }
  }

  @Override
  public int compareTo(Equipe outraEquipe) {
    if (this.qtdPontos > outraEquipe.getQtdPontos()) {
      return -1;
    }
    if (this.qtdPontos < outraEquipe.getQtdPontos()) {
      return 1;
    }
    return 0;
  }

  public String status(){
    return "\n---- STATUS ---- \n\n:: " +nome+ " :: \nDivisão: " +divisao+ " | Pontos: " +qtdPontos+ "\nVitórias: " +vitorias+ " | Derrotas: " +derrotas;
  }

  @Override
  public String toString() {
      return "\n" +nome + "\nDivisao: " + divisao + "\nPontos: " + qtdPontos + "\nVitorias:" + vitorias
              + " | Derrotas: " + derrotas + "\nTécnico: " + tecnico.getNome() + "\nEscalação:" + jogadores;
  }
}
