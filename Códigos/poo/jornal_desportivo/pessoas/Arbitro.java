package poo.jornal_desportivo.pessoas;

public class Arbitro extends Pessoa{

  private String cargo;

  
  public Arbitro(String nome, String cargo) {
    super(nome);
    this.cargo = cargo;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  
  public String apitar(){
    return "\nÁRBITRO: *piiiiiiiiiiiii* {som de apito}: -Fica esperto aí rapaz";
  }

  public String aplicarPenalidade(Jogador jogador){
    String mesg = null;
    if(jogador.getQtdCartao() < 1){
      mesg = "\nÁRBITRO: {som de apito}: -Aí não companheiro\n" +jogador.getNome()+ " recebeu o primeiro cartão amarelo.";
      jogador.setQtdCartao(jogador.getQtdCartao() + 1);
    }
    else if(jogador.getQtdCartao() == 1){
      mesg = "\nÁRBITRO: {som de apito} -Já era aí chefia\n" +jogador.getNome()+ " recebeu o segundo cartão amarelo, expulsando-o da partida por somarem um vermelho";
      jogador.setQtdCartao(jogador.getQtdCartao() + 1);
      jogador.setTitular(false);
    }
    return mesg;
  } 
}
