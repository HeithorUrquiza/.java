package poo_II.fabrica_de_notebooks.padrao_AbstractFactory;

import java.util.ArrayList;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.AsusFabrica;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.FabricaNotebook;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.GigabyteFabrica;
import poo_II.fabrica_de_notebooks.padrao_AbstractFactory.fabricas.MSIFabrica;

public class Main {

    public static ArrayList<String> configuracoes(String marca, String path, String qtd){
        
        ArrayList<String> configuracao = new ArrayList<>();
        configuracao.add(marca);
        configuracao.add(path);
        configuracao.add(qtd);

        return configuracao;
    }

    public static void fabricar(ArrayList<String> configuracao){
        
        String marca = configuracao.get(0).toUpperCase();
        String path = configuracao.get(1);
        int qtd = Integer.parseInt(configuracao.get(2));
        ArrayList<Aplicacao> notebooks = new ArrayList<>();
        FabricaNotebook fabrica;
        Aplicacao app;

        if (marca.equals("ASUS")){
            fabrica = new AsusFabrica();
        } else if(marca.equals("MSI")) {
            fabrica = new MSIFabrica();
        } else if(marca.equals("GIGABYTE")){
            fabrica = new GigabyteFabrica();
        } else {
            return;
        }

        for(int i = 0; i < qtd; i++){
            app = new Aplicacao(fabrica, path);

            notebooks.add(app);
        }

        int count = 1;
        for (Aplicacao item : notebooks) {
            StringBuilder sb = new StringBuilder();
                sb.append("\n" + "-".repeat(49));
                sb.append("\n|" + " ".repeat(18) + "Notebook  " + count + " ".repeat(18) + "|");
                sb.append("\n" + "-".repeat(49));
                System.out.print(sb.toString());
                item.paint();
                count++;            
        }
    }
    

    public static void main(String[] args) {

        ArrayList<String> configuracoes = configuracoes("gigabyte", "C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\fabrica_de_notebooks\\padrao_AbstractFactory\\pecas.csv", "3");

        fabricar(configuracoes);
    }
}
