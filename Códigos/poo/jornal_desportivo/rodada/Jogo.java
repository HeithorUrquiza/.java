package poo.jornal_desportivo.rodada;

import poo.jornal_desportivo.pessoas.Arbitro;

public class Jogo {

  private String data;
  private String horaio;
  private String local;
  private String resultado;
  private Arbitro arbitro;
  private boolean marcado;
  private Equipe visitante;
  private Equipe visitado;
  private int pontoVisitante;
  private int pontoVisitada;


  public Jogo(String data, String horario,String local, Arbitro arbitro, Equipe visitante, Equipe visitado) {
    this.data = data;
    this.horaio = horario;
    this.local = local;
    this.marcado = false;
    this.arbitro = arbitro;
    this.visitante = visitante;
    this.visitado = visitado;
    this.pontoVisitada = 0;
    this.pontoVisitante = 0;
  }

  //Getters e Setters
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHoraio() {
    return horaio;
  }

  public void setHoraio(String horaio) {
      this.horaio = horaio;
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

  public boolean getMarcado() {
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

  //Métodos
  public void marcarJogo(){
    if(this.visitante.getDivisao().equals(this.visitado.getDivisao()) && this.visitante.getNome() != this.visitado.getNome()){
      this.setMarcado(true);
      System.out.println("Jogo marcado");
    }
  }

  public String exibirEquipes(Equipe equipeVisitante, Equipe equipeVisitada){
    return "\nEquipe Visitante : " +equipeVisitante.toString()+ "\n\nEquipe Visitada   : " +equipeVisitada.toString();
  }

  public void marcarPontoVisitante(){
    if (marcado) {
      this.setPontoVisitante(this.getPontoVisitante() + 1);
      System.out.println("Gol do " + visitante.getNome());
    }
  }

  public void marcarPontoVisitada(){
    if (marcado) {
      this.setPontoVisitada(this.getPontoVisitada() + 1);
      System.out.println("Gol do " + visitado.getNome());
    }
  }
  
  public String exibirPlacar(){
    String text = null;
    if (marcado) {
      text = "\n -=-=-=-=-= PLACAR =-=-=-=-=-" + "\n\n " + this.visitante.getNome() + " " + this.getPontoVisitante() + " x " + this.getPontoVisitada() + " " + this.visitado.getNome();
    } else {
      text = "\nEste jogo não foi autorizado devido a diferença de divisão entre os times";
    }
    return text;
  }
  
  public String coletarResultado(){
    String text = null;
    if (marcado) {
      text = "\n -=-=-=-=-= RESULTADO =-=-=-=-=-\n\nData: " + this.data + "\nLocal: " +local+ "\nÁrbitro: " +this.arbitro.getNome();
      this.marcado = false;
      exibirPlacar();

      if(pontoVisitada > pontoVisitante){
        this.visitado.setQtdPontos(this.visitado.getQtdPontos() + 3);
        this.visitado.setVitorias(this.visitado.getVitorias() + 1);
        this.visitante.setQtdPontos(this.visitante.getQtdPontos() - 2);
        this.visitante.setDerrotas(this.visitante.getDerrotas() + 1);
      }
      
      else if(pontoVisitante > pontoVisitada){
        this.visitante.setQtdPontos(this.visitante.getQtdPontos() + 3);
        this.visitante.setVitorias(this.visitante.getVitorias() + 1);
        this.visitado.setQtdPontos(this.visitado.getQtdPontos() - 2);
        this.visitado.setDerrotas(this.visitado.getDerrotas() + 1);
      }

      else if(pontoVisitada == pontoVisitante){
        this.visitante.setQtdPontos(this.visitante.getQtdPontos() + 1);
        this.visitado.setQtdPontos(this.visitado.getQtdPontos() + 1);
      }
    } else {
      text = "\nEste jogo ainda não aconteceu !!!";
    }
    return text;
  }

  @Override
  public String toString() {
      return "\nData: " + data + " | Local:" + local + " |  Árbitro: " + arbitro.getNome() + " | Marcado: " + marcado + " | Time visitante: "
              + visitante.getNome() + " | Time visitado; " + visitado.getNome();
  }
}
