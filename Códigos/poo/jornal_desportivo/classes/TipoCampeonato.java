package classes;

public enum TipoCampeonato {

  REGIONAL("Campeonato Regional"),
  PRIMEIRA_DIVISAO("Primeira Divisão"),
  SEGUNDA_DIVISAO("Segunda Divisão");

  private String tipo;

  TipoCampeonato(String tipo){
    this.tipo = tipo;
  }
  
  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}
