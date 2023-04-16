package poo_II.decorator;

public abstract class Decorador implements ComponenteVisual{
    protected ComponenteVisual componente;

    public Decorador(ComponenteVisual componente) {
        this.componente = componente;
    }

    public void desenhar() {
        componente.desenhar();
    }
}
