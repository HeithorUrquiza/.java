package poo_II.decorator;

public class Main {
    public static void main(String[] args) {
        ComponenteVisual janela = new Janela();
        ComponenteVisual janelaComBarraDeRolagem = new BarraDeRolagem(janela);

        janelaComBarraDeRolagem.desenhar();
    }
}

