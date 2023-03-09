package poo_II.fabrica_de_notebooks.padrao_AbstractFactory;

import java.nio.file.Path;
import java.util.ArrayList;

import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.FabricaNotebook;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks.Notebook;

public class Aplicacao {
    
    private ArrayList<Notebook> notebooks;

    public Aplicacao(FabricaNotebook fabrica, String path, int qtd){
        for(int i = 0; i < qtd; i++){
            notebooks.add(fabrica.criarNotebook(path));
        }
    }

    public void print(){
       System.out.println(notebooks);
    }
}
