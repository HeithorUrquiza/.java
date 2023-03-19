package poo_II.facade;

import poo_II.facade.sistemas.SistemaAudio;
import poo_II.facade.sistemas.SistemaDeControleVoo;
import poo_II.facade.sistemas.SistemaDeExibicao;

public class SimuladorDeVooFacade {
    
    private SistemaDeControleVoo sistemaDeControleVoo;
    private SistemaDeExibicao sistemaDeExibicao;
    private SistemaAudio sistemaAudio;


    public SimuladorDeVooFacade(){
        this.sistemaDeControleVoo = new SistemaDeControleVoo();
        this.sistemaDeExibicao = new SistemaDeExibicao();
        this.sistemaAudio = new SistemaAudio();
    }


    public void inicarSimulador() throws InterruptedException{
        sistemaDeControleVoo.inicializar();
        System.out.print("\n");
        sistemaDeExibicao.exibirTelaInicializacao();
        System.out.print("\n");
    }

    public void decolar() throws InterruptedException{
        sistemaDeControleVoo.aumentarVelocidade(280);
        System.out.print("\n");
        sistemaDeControleVoo.decolar();
        sistemaAudio.somDecolagem();
        System.out.print("\n\n");
        sistemaDeExibicao.exibirTelaDecolagem();
        System.out.println("\n");

    }

    public void voar() throws InterruptedException{
        /*sistemaDeControleVoo.ligarPilotoAutomatico();
        System.out.println("\n");
        sistemaDeExibicao.exibirTelaVoo();
        System.out.println(" ");*/
        sistemaAudio.tocarMusicaFundo();
        System.out.println("\nTemperatura atual: " + sistemaDeControleVoo.getTemperatura() + "°C\n");
        sistemaDeControleVoo.aumentarAltitude();
        
    }

    public void pousar() throws InterruptedException{
        Thread.sleep(7000);
        sistemaDeControleVoo.desligarPilotoAutomatico();
        System.out.println("\n");
        sistemaDeControleVoo.diminuirAltitude();
        sistemaDeControleVoo.pousar();
        sistemaDeControleVoo.diminuirVelocidade(0);
        sistemaDeExibicao.exibirTelaPouso();
        sistemaAudio.pararAudio();
    }

    public void encerrarSimulador() throws InterruptedException{
        sistemaDeExibicao.exibirTelaEncerramento();
        sistemaDeControleVoo.desligar();
    }
}
