package poo_II.facade.sistemas;

public class SistemaDeControleVoo {
    
    private int altura = 0;
    private int velocidade = 0;
    private int temperatura = 25;
    

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


    public void inicializar() throws InterruptedException{
        String msg = "Inicializando sistema...\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            if(i > 20){
                Thread.sleep(1000);
                System.out.print(msg.charAt(i));
            } else {
                System.out.print(msg.charAt(i));
                Thread.sleep(70);
            }
        }
    }
    
    public void ligarPilotoAutomatico() throws InterruptedException{
        String msg = "\n\nAtivando piloto automático!!\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void desligarPilotoAutomatico() throws InterruptedException{
        String msg = "\n\nDesativando piloto automático!!\n\n"; 

        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void aumentarVelocidade(int valor) throws InterruptedException{
        while (this.getVelocidade() < valor) {
            if(this.getVelocidade() > 130){
                this.setVelocidade(this.getVelocidade() + 13);
            } else {
                this.setVelocidade(this.getVelocidade() + 7);
            }
            System.out.println("Velocidade atual: " + this.getVelocidade() + "Km/h");
            Thread.sleep(450);
        }
    }

    public void diminuirVelocidade(int valor) throws InterruptedException{
        while (this.getVelocidade() > valor) {
            if(this.getVelocidade() < 130){
                this.setVelocidade(this.getVelocidade() - 7);
            } else {
                this.setVelocidade(this.getVelocidade() - 13);
            }
            System.out.println("Velocidade atual: " + this.getVelocidade() + "Km/h");
            Thread.sleep(300);
        }
    }

    public void aumentarAltitude() throws InterruptedException{
        for(int i = 0; i < 30; i++){
            this.setAltura(this.getAltura() + 1500);
            System.out.println("Altitude atual: " + this.getAltura() + "m");
            Thread.sleep(1000);
            
            if(this.getAltura() == 30000){
                this.setTemperatura(this.getTemperatura() - 1);
                System.out.println("\nTemperatura atual: " + this.getTemperatura() + "°C\n");
            } else if (this.getAltura() == 45000){
                this.setTemperatura(this.getTemperatura() - 1);
                System.out.println("\nTemperatura atual: " + this.getTemperatura() + "°C\n");
            }
        }
    }

    public void diminuirAltitude() throws InterruptedException{
        for(int i = 0; i < 29; i++){
            this.setAltura(this.getAltura() - 1500);
            System.out.println("Altitude atual: " + this.getAltura() + "m");
            Thread.sleep(1000);
            
            if(this.getAltura() == 30000){
                this.setTemperatura(this.getTemperatura() + 1);
                System.out.println("\nTemperatura atual: " + this.getTemperatura() + "°C\n");
            } else if (this.getAltura() == 1500){
                this.setTemperatura(this.getTemperatura() + 1);
                System.out.println("\nTemperatura atual: " + this.getTemperatura() + "°C\n");
            }
        }
    }

    public void decolar() throws InterruptedException{
        String msg = "\nDecolando!!\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void pousar() throws InterruptedException{
        String msg = "\nPousando!!\n\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            System.out.print(msg.charAt(i));
            Thread.sleep(70);
        }
    }

    public void desligar() throws InterruptedException{
        String msg = "\nEncerrando simulador...\n"; 
        
        for(int i = 0; i < msg.length(); i++){
            if(i > 19){
                Thread.sleep(1000);
                System.out.print(msg.charAt(i));
            } else {
                System.out.print(msg.charAt(i));
                Thread.sleep(70);
            }
        }
    }
}
