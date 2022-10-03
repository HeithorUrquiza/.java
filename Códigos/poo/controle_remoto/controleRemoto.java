package poo.controle_remoto;

import poo.controle_remoto.controlador.Controlador;

public class controleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //método construtor
    public controleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    //métodos acessores
    private int getVolume(){
        return volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);  
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("\n --- MENU ---");
            System.out.println("Ligado: " +this.getLigado());
            System.out.println("Tocando: " +this.getTocando());
            System.out.printf("Volume: %d ", this.getVolume());
            for (int i = 0; i < this.getVolume(); i+=5){
                System.out.print("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando menu... ");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
