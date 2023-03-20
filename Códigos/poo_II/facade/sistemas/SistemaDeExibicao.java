package poo_II.facade.sistemas;

public class SistemaDeExibicao {
    public void exibirTelaInicializacao() throws InterruptedException{
        String msg = "\n...Exibindo tela inical...\n\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void exibirTelaEncerramento() throws InterruptedException{
        String msg = "\n\n...Exibindo tela final...\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void exibirTelaVoo() throws InterruptedException{
        String msg = "\n...Exibindo tela de voo...\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void exibirTelaPouso() throws InterruptedException{
        String msg = "\n...Exibindo tela de pouso...\n\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void exibirTelaDecolagem() throws InterruptedException{
        String msg = "\n...Exibindo tela de decolagem...\n\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }
}
