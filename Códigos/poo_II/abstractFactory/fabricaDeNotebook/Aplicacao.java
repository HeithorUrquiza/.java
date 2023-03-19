package poo_II.abstractFactory.fabricaDeNotebook;

import poo_II.abstractFactory.fabricaDeNotebook.fabricas.FabricaNotebook;
import poo_II.abstractFactory.fabricaDeNotebook.notebooks.Notebook;

public class Aplicacao {
    
    private Notebook notebook;

    public Aplicacao(FabricaNotebook fabrica, String path){
        notebook = fabrica.criarNotebook(path);
    }

    public void paint(){
       System.out.println(notebook.exibirNotebook());
    }
}
