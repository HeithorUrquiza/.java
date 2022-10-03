package poo.jornal_desportivo;

import java.util.Arrays;

public class Campeonato {
    
    private String name;
    private Jogo[] game;


    public Campeonato(String name, Jogo[] game) {
        this.name = name;
        this.game = game;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogo[] getGame() {
        return game;
    }

    public void setGame(Jogo[] game) {
        this.game = game;
    }

    public String rounds() { // Retorna todos os jogos aprovados/marcados
        return "\nRodadas: " + Arrays.toString(game);
    }
}
