package poo.jornal_desportivo;

import java.util.ArrayList;

import poo.jornal_desportivo.pessoas.Arbitro;
import poo.jornal_desportivo.pessoas.Jogador;
import poo.jornal_desportivo.pessoas.Tecnico;
import poo.jornal_desportivo.rodada.Equipe;
import poo.jornal_desportivo.rodada.Jogo;
import poo.jornal_desportivo.rodada.Rodada;

public class App {
    public static void main(String[] args) {
        
        // Técnicos
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
        tecnicos.add(new Tecnico("Fernando", "Técnico"));
        tecnicos.add(new Tecnico("Henrique", "Técnico"));
        tecnicos.add(new Tecnico("Cardoso", "Técnico"));
        tecnicos.add(new Tecnico("De Sá", "Técnico"));

        // -----------------------------------------------------------------------------
        // Árbitros
        ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
        arbitros.add(new Arbitro("Pedro", "Juíz"));
        arbitros.add(new Arbitro("Paulinho", "Juíz"));
        arbitros.add(new Arbitro("Cardoso", "Juíz"));
        arbitros.add(new Arbitro("Fernando", "Juís"));

        // -----------------------------------------------------------------------------
        // Jogadores
        ArrayList<Jogador> jogadoresA = new ArrayList<Jogador>();
        jogadoresA.add(new Jogador("Guilherme", "Brasileira", "Goleiro", true));
        jogadoresA.add(new Jogador("Caio", "Brasileira", "Meia", true));
        jogadoresA.add(new Jogador("Nicolas", "Brasileira", "Atacante", true));
        jogadoresA.add(new Jogador("Cauê", "Brasileira", "Zagueiro", true));
        jogadoresA.add(new Jogador("Pietro", "Brasileira", "Zagueiro", true));
        jogadoresA.add(new Jogador("Danilo", "Brasileira", "Atacante", false));
        jogadoresA.add(new Jogador("Caike", "Brasileira", "Goleiro", false));
        
        ArrayList<Jogador> jogadoresB = new ArrayList<Jogador>();
        jogadoresB.add(new Jogador("Vitor", "Brasileira", "Goleiro", true));
        jogadoresB.add(new Jogador("Luccas", "Brasileira", "Meia", true));
        jogadoresB.add(new Jogador("Tiago", "Brasileira", "Atacante", true));
        jogadoresB.add(new Jogador("Maicon", "Brasileira", "Zagueiro", true));
        jogadoresB.add(new Jogador("Pedro", "Brasileira", "Zagueiro", true));
        jogadoresB.add(new Jogador("Daniel", "Brasileira", "Atacante", false));
        jogadoresB.add(new Jogador("Caio", "Brasileira", "Goleiro", false));
        
        ArrayList<Jogador> jogadoresC = new ArrayList<Jogador>();
        jogadoresC.add(new Jogador("Diogo", "Brasileira", "Goleiro", true));
        jogadoresC.add(new Jogador("Fernando", "Brasileira", "Meia", true));
        jogadoresC.add(new Jogador("Nicolau", "Brasileira", "Atacante", true));
        jogadoresC.add(new Jogador("Santiago", "Brasileira", "Zagueiro", true));
        jogadoresC.add(new Jogador("Whilliam", "Brasileira", "Zagueiro", true));
        jogadoresC.add(new Jogador("Denilson", "Brasileira", "Atacante", false));
        jogadoresC.add(new Jogador("Richard", "Brasileira", "Goleiro", false));
        
        ArrayList<Jogador> jogadoresD = new ArrayList<Jogador>();
        jogadoresD.add(new Jogador("Enzo", "Brasileira", "Goleiro", true));
        jogadoresD.add(new Jogador("Breno", "Brasileira", "Meia", true));
        jogadoresD.add(new Jogador("Rennan", "Brasileira", "Atacante", true));
        jogadoresD.add(new Jogador("Kauan", "Brasileira", "Zagueiro", true));
        jogadoresD.add(new Jogador("Bruno", "Brasileira", "Zagueiro", true));
        jogadoresD.add(new Jogador("Bejamin", "Brasileira", "Atacante", false));
        jogadoresD.add(new Jogador("Cristian", "Brasileira", "Goleiro", false));

        // -----------------------------------------------------------------------------
        // Equipes
        ArrayList<Equipe> equipes = new ArrayList<Equipe>();
        equipes.add(new Equipe("Canhotos da Serra", Tipo.PRIMEIRA_DIVISAO.getTipo(), tecnicos.get(0), jogadoresA));
        equipes.add(new Equipe("Malandrinhos FC", Tipo.PRIMEIRA_DIVISAO.getTipo(), tecnicos.get(1), jogadoresB));
        equipes.add(new Equipe("Pernetas CIA", Tipo.SEGUNDA_DIVISAO.getTipo(), tecnicos.get(2), jogadoresC));
        equipes.add(new Equipe("Palmeiras com Mundial", Tipo.SEGUNDA_DIVISAO.getTipo(), tecnicos.get(3), jogadoresD));

        // -----------------------------------------------------------------------------
        // Jogos
        ArrayList<Jogo> jogos1 = new ArrayList<Jogo>();
        jogos1.add(new Jogo("20/06/2023", "18:00", "Serrinha", arbitros.get(0), equipes.get(0), equipes.get(1)));
        jogos1.add(new Jogo("22/06/2023", "18:00", "Serrinha", arbitros.get(1), equipes.get(1), equipes.get(0)));
        jogos1.add(new Jogo("25/06/2023", "18:00", "Serrinha", arbitros.get(3), equipes.get(2), equipes.get(3)));
        jogos1.add(new Jogo("26/06/2023", "18:00", "Serrinha", arbitros.get(1), equipes.get(3), equipes.get(2)));
        
        ArrayList<Jogo> jogos2 = new ArrayList<Jogo>();
        jogos2.add(new Jogo("30/06/2023", "18:00", "Serrinha", arbitros.get(3), equipes.get(1), equipes.get(0)));
        jogos2.add(new Jogo("31/06/2023", "18:00", "Serrinha", arbitros.get(2), equipes.get(0), equipes.get(1)));
        jogos2.add(new Jogo("02/07/2023", "18:00", "Serrinha", arbitros.get(0), equipes.get(3), equipes.get(2)));
        jogos2.add(new Jogo("03/07/2023", "18:00", "Serrinha", arbitros.get(2), equipes.get(2), equipes.get(3)));

        ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
        rodadas.add(new Rodada(1, 2023, jogos1));
        rodadas.add(new Rodada(2, 2023, jogos2));

        ArrayList<Campeonato> campeonatos = new ArrayList<>();

    }
}
