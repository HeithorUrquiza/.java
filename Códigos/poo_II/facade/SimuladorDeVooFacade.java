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
        sistemaDeExibicao.exibirTelaInicializacao();
    }

    public void decolar() throws InterruptedException{
        sistemaAudio.somDecolagem();
        sistemaDeControleVoo.aumentarVelocidade(280);
        sistemaDeControleVoo.decolar();
        sistemaDeExibicao.exibirTelaDecolagem();
    }

    public void voar() throws InterruptedException{
        sistemaDeControleVoo.ligarPilotoAutomatico();
        sistemaAudio.tocarMusicaFundo();
        sistemaDeExibicao.exibirTelaVoo();
        System.out.println("\nTemperatura atual: " + sistemaDeControleVoo.getTemperatura() + "°C\n");
        sistemaDeControleVoo.aumentarAltitude();
    }

    public void pousar() throws InterruptedException{
        Thread.sleep(9000);
        sistemaDeControleVoo.desligarPilotoAutomatico();
        sistemaDeControleVoo.diminuirAltitude();
        sistemaDeControleVoo.pousar();
        sistemaAudio.pararAudio();
        sistemaAudio.somAterrissagem();
        sistemaDeControleVoo.diminuirVelocidade(1);
        sistemaDeControleVoo.setAltura(sistemaDeControleVoo.getAltura() - 1500);
        System.out.println("\nAltitude: " + sistemaDeControleVoo.getAltura() + "m");
        sistemaDeExibicao.exibirTelaPouso();
        Thread.sleep(1500);
    }

    public void encerrarSimulador() throws InterruptedException{
        sistemaDeExibicao.exibirTelaEncerramento();
        sistemaDeControleVoo.desligar();
    }
}
