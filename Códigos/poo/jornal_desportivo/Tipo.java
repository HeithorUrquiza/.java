package poo.jornal_desportivo;

public enum Tipo {

  REGIONAL("Regional"),
  PRIMEIRA_DIVISAO("Primeira Divisão"),
  SEGUNDA_DIVISAO("Segunda Divisão");

  private String tipo;

  Tipo(String tipo){
    this.tipo = tipo;
  }
  
  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}
