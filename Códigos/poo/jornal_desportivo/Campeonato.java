package poo.jornal_desportivo;

import java.util.ArrayList;
import java.util.Collections;
import poo.jornal_desportivo.rodada.Equipe;
import poo.jornal_desportivo.rodada.Rodada;
import java.util.HashMap;
import java.util.Map;

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
  public void exibirClassif(ArrayList<Equipe> equipes){
    int i = 1;
    Collections.sort(equipes);
    System.out.println("\n---- CLASSIFICAÇÃO ----\n");
    for (Equipe equipe : equipes) {
      if(this.tipoC.equals(equipe.getDivisao())){ // Exibe somente os times que se encaixam naquele tipo de campeonato
        System.out.println(" " +i+ "°  " +equipe.getNome()+ " :: " +equipe.getQtdPontos());
        i++;
      }
    }
  }

  @Override
  public String consultarEquipe(ArrayList<Equipe> equipes, String nomeEquipe){
    String text = null;
    Map<String, Equipe> consult = new HashMap<String, Equipe>();
    for (Equipe equipe : equipes) {
      if(this.tipoC.equals(equipe.getDivisao())){
        consult.put(equipe.getNome(), equipe);
      }
    }
    text = consult.get(nomeEquipe).status();

    return text;
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
