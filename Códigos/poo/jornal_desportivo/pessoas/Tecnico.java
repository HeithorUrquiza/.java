package poo.jornal_desportivo.pessoas;

public class Tecnico extends Pessoa{

  private String funcao;


  public Tecnico(String nome, String funcao ) {
    super(nome);
    this.funcao = funcao;
  }


  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {  
    this.funcao = funcao;
  }


  public String elaborarTatica(){
    return "Tô pensando, to pensando, tô pesando...";
  }

  public String repassarTatica(){
    return "Você vai para ali, você aí vem pra cá, e você ali vai pra lá!";
  }
}
