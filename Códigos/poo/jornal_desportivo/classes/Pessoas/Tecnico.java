package classes.Pessoas;

public class Tecnico extends Pessoa{

  public Tecnico(String nome) {
    super(nome);
  }

  public void elaborarTatica(){
    System.out.println("Tô pensando, to pensando, tô pesando...");
  }

  public void repassarTatica(){
    System.out.println("Você vai para ali, você aí vem pra cá, e você ali vai pra lá!");
  }

}
