package poo.jornal_desportivo;

import java.util.ArrayList;
import poo.jornal_desportivo.rodada.Equipe;


public interface Interface {
  
  public abstract void exibirClassif(ArrayList<Equipe> equipes);
  public abstract String consultarEquipe(ArrayList<Equipe> equipes, String nomeEquipe);
  public abstract String consultarCamp(ArrayList<Campeonato> campeonatos, int idCamp);
  public abstract String exibirProgramacao();
}
