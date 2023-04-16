package poo_II.decorator;

public class BarraDeRolagem extends Decorador{

    public BarraDeRolagem(ComponenteVisual componente) {
        super(componente);
    }

    public void desenhar() {
        super.desenhar();
        System.out.println("Adicionando uma barra de rolagem.");
    } 
}
