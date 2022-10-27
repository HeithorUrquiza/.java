package classes.Jogo;

import classes.Pessoas.Arbitro;
import classes.Pessoas.Equipe;

public class Jogo {

  private String data;
  private String local;
  private String resultado;
  private Arbitro arbitro;
  private boolean marcado = true;
  private Equipe visitante;
  private Equipe visitado;
  private int pontoVisitante = 0;
  private int pontoVisitada = 0;

  public Jogo(String data, String local, Arbitro arbitro, Equipe visitante, Equipe visitado) {
    this.data = data;
    this.local = local;
    this.arbitro = arbitro;
    this.visitante = visitante;
    this.visitado = visitado;
  }

  public void exibirEquipes(Equipe equipeVisitante, Equipe equipeVisitada){
    System.out.println("Equipe visitante  : " + equipeVisitante.getNome());
    System.out.println("Equipe visitada   : " + equipeVisitada.getNome());
  }

  public void marcarPontoVisitante(){
    this.pontoVisitante += 1;
    System.out.println("Gol do " + visitante.getNome());
  }

  public void marcarPontoVisitada(){
    this.pontoVisitada += 1;
    System.out.println("Gol do " + visitado.getNome());
  }
  
  public void exibirPlacar(){
    System.out.println();
    System.out.println("-=-=-=-=-= PLACAR =-=-=-=-=-");
    System.out.println(this.visitante.getNome() + ": " + this.pontoVisitante);
    System.out.println(this.visitado.getNome() + ": " + this.pontoVisitada);
    System.out.println();
  }
  
  public void coletarResultado(){
    System.out.println("\n-=-=-=-=-= RESULTADO =-=-=-=-=-\n");
    
    System.out.println("Data: " + this.data);
    System.out.println("Local: " + this.local);
    System.out.println("Árbitro: " + this.arbitro.getNome());
    this.marcado = false;
    exibirPlacar();

    if(pontoVisitada > pontoVisitante){
      this.visitado.setQtdPontos(this.visitado.getQtdPontos() + 3);
      this.visitado.setVitorias(this.visitado.getVitorias() + 1);
      this.visitante.setDerrotas(this.visitante.getDerrotas() + 1);
    }
    
    else if(pontoVisitante > pontoVisitada){
      this.visitante.setQtdPontos(this.visitante.getQtdPontos() + 3);
      this.visitante.setVitorias(this.visitante.getVitorias() + 1);
      this.visitado.setDerrotas(this.visitado.getDerrotas() + 1);
    }

    else if(pontoVisitada == pontoVisitante){
      this.visitante.setQtdPontos(this.visitante.getQtdPontos() + 1);
      this.visitado.setQtdPontos(this.visitado.getQtdPontos() + 1);
    }
  }



  public String getData() {
    return data;
  }



  public void setData(String data) {
    this.data = data;
  }



  public String getLocal() {
    return local;
  }



  public void setLocal(String local) {
    this.local = local;
  }



  public String getResultado() {
    return resultado;
  }



  public void setResultado(String resultado) {
    this.resultado = resultado;
  }



  public Arbitro getArbitro() {
    return arbitro;
  }



  public void setArbitro(Arbitro arbitro) {
    this.arbitro = arbitro;
  }



  public boolean isMarcado() {
    return marcado;
  }



  public void setMarcado(boolean marcado) {
    this.marcado = marcado;
  }



  public Equipe getVisitante() {
    return visitante;
  }



  public void setVisitante(Equipe visitante) {
    this.visitante = visitante;
  }



  public Equipe getVisitado() {
    return visitado;
  }



  public void setVisitado(Equipe visitado) {
    this.visitado = visitado;
  }



  public int getPontoVisitante() {
    return pontoVisitante;
  }



  public void setPontoVisitante(int pontoVisitante) {
    this.pontoVisitante = pontoVisitante;
  }



  public int getPontoVisitada() {
    return pontoVisitada;
  }



  public void setPontoVisitada(int pontoVisitada) {
    this.pontoVisitada = pontoVisitada;
  }


}
