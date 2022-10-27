package classes.Pessoas;

public class Jogador extends Pessoa {
  private String nacionalidade;
  private String posicao;
  private boolean titular;
  private int qtdCartao = 0;

  public Jogador(String nome, String nacionalidade, String posicao, boolean titular) {
    super(nome);
    this.nacionalidade = nacionalidade;
    this.posicao = posicao;
    this.titular = titular;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getPosicao() {
    return posicao;
  }

  public void setPosicaoString(String posicao) {
    this.posicao = posicao;
  }

  public boolean isTitular() {
    return titular;
  }

  public void setTitular(boolean titular) {
    this.titular = titular;
  }

  public int getQtdCartao() {
    return qtdCartao;
  }

  public void setQtdCartao(int qtdCartao) {
    this.qtdCartao = qtdCartao;
  }

  
}
