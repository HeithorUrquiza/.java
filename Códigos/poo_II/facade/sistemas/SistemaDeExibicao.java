package poo_II.facade.sistemas;

public class SistemaDeExibicao {
    public void exibirTelaInicializacao() throws InterruptedException{
        String msg = "Exibindo tela inical..."; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(67);
        }
    }

    public void exibirTelaEncerramento() throws InterruptedException{
        String msg = "Exibindo tela final..."; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(67);
        }
    }

    public void exibirTelaVoo() throws InterruptedException{
        String msg = "\nExibindo tela de voo..."; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(67);
        }
    }

    public void exibirTelaPouso() throws InterruptedException{
        String msg = "\nExibindo tela de pouso..."; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(67);
        }
    }

    public void exibirTelaDecolagem() throws InterruptedException{
        String msg = "Exibindo tela de decolagem..."; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(67);
        }
    }
}
