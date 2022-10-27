package classes.Pessoas;

public class Arbitro extends Pessoa{

  private String cargo;

  
  public Arbitro(String nome, String cargo) {
    super(nome);
    this.cargo = cargo;
  }

  public void apitar(){
    System.out.println("ÁRBITRO: *ziiiiiiiiiiiii som de apito* Fica esperto aí rapaz");
  }

  public void aplicarPenalidade(Jogador jogador){
    if(jogador.getQtdCartao() == 0){
      System.out.println("ÁRBITRO: *som de apito* aí não companheiro");
      System.out.println("Jogador " + jogador.getNome() + " recebeu o primeiro cartão amarelo.\n");
      jogador.setQtdCartao(jogador.getQtdCartao() + 1);
    }
    else if(jogador.getQtdCartao() == 1){
      System.out.println("ÁRBITRO: *som de apito* toma cuidado aí chefia");
      System.out.println("Jogador " + jogador.getNome() + " recebeu o segundo cartão amarelo.\n");
      jogador.setQtdCartao(jogador.getQtdCartao() + 1);
    }
    else{
      System.out.println("ÁRBITRO: *fiuuuuuuuuuuu som de apito cansado*, tá fora, vai procurar sua turma");
      System.out.println("Jogador " + jogador.getNome() + " recebeu o cartão vermelho e foi de base.\n");
      jogador.setQtdCartao(jogador.getQtdCartao() + 1);
      jogador.setTitular(false);

    }
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
}
