package poo_II.fabrica_de_notebooks.padrao_AbstractFactory;

import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.FabricaNotebook;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks.Notebook;

public class Aplicacao {
    
    private Notebook notebook;

    public Aplicacao(FabricaNotebook fabrica, String path){
        notebook = fabrica.criarNotebook(path);
    }

    public void paint(){
       System.out.println(notebook.exibirNotebook());
    }
}
