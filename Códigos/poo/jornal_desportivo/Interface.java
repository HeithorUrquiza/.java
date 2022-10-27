package poo.jornal_desportivo;

import java.util.ArrayList;

public interface Interface {
  
  public abstract void exibirClassif();
  public abstract String consultarCamp(ArrayList<Campeonato> campeonatos, int idCamp);
  public abstract String exibirProgramacao();

}
