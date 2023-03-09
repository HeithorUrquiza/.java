package poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas;

import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.Aplicacao;

public class app {
    public static void main(String[] args) {
        
        Aplicacao app = new Aplicacao(new AsusFabrica(), "C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\fabrica_de_notebooks\\padrao_AbstractFactory\\pecas.csv", 3);

        app.print();
        
    }
}
