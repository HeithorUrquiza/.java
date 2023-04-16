package poo_II.composite;

import java.util.ArrayList;

public class Documento implements Componente {
    private ArrayList<Componente> componentes;

    public Documento() {
        componentes = new ArrayList<Componente>();
    }

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void imprimir() {
        for (Componente c : componentes) {
            c.imprimir();
        }
    }
}
