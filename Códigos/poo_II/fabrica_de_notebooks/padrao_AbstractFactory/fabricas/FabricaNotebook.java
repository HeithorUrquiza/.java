package poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas;

import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks.Notebook;

public interface FabricaNotebook {
    Notebook criarNotebook(String path);
}
