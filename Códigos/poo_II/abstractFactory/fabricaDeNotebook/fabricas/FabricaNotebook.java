package poo_II.abstractFactory.fabricaDeNotebook.fabricas;

import poo_II.abstractFactory.fabricaDeNotebook.notebooks.Notebook;

public interface FabricaNotebook {
    Notebook criarNotebook(String path);
}
