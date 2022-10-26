package poo.jornal_desportivo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>(); // Técnicos
        tecnicos.add(new Tecnico("Ramalho", "Técnico"));
        tecnicos.add(new Tecnico("Bringstom", "Técnico"));
        

        ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>(); // Árbitros
        arbitros.add(new Arbitro("Zeca", "Arbitragem", "Juíz"));
        arbitros.add(new Arbitro("Peralta", "Arbitragem", "Bandeirinha"));
        arbitros.add(new Arbitro("Whilliawn", "Arbitragem", "Juíz"));
        arbitros.add(new Arbitro("Ramsés", "Arbitragem", "Bandeirinha"));
        arbitros.add(new Arbitro("Ricardo", "Arbitragem", "Bandeirinha"));


        ArrayList<Jogador> jogadores1 = new ArrayList<Jogador>(); // Jogadores
        jogadores1.add(new Jogador("Danny Ward", "Jogador", "País de Gales", "Goleiro", false));
        jogadores1.add(new Jogador("Ben Davies", "Jogador", "País de Gales", "Zageiro", false));
        jogadores1.add(new Jogador("Chris Mepham", "Jogador", "País de Gales", "Lateral direito", false));
        jogadores1.add(new Jogador("Connor Roberts", "Jogador", "País de Gales", "Lateral esquerdo", false));
        jogadores1.add(new Jogador("Joe Morrell", "Jogador", "País de Gales", "Meio campo", false));
        jogadores1.add(new Jogador("Aaron Ramsey", "Jogador", "País de Gales", "Meio esquerdo", false));
        jogadores1.add(new Jogador("Harry Wilson", "Jogador", "País de Gales", "Meio direito", false));
        jogadores1.add(new Jogador("Gareth Bale", "Jogador", "País de Gales", "Atacante direito", false));
        jogadores1.add(new Jogador("Kieffer Moore", "Jogador", "País de Gales", "Atacante", false));
        jogadores1.add(new Jogador("Daniel James", "Jogador", "País de Gales", "Atacante esquerdo", false));
        jogadores1.add(new Jogador("Brennan Johnson", "Jogador", "País de Gales", "Ponta esquerda", true));
        jogadores1.add(new Jogador("Neco Williams", "Jogador", "País de Gales", "Zagueiro", true));
        jogadores1.add(new Jogador("Jonatham Williams", "Jogador", "País de Gales", "Volante", true));

        
        ArrayList<Jogador> jogadores2 = new ArrayList<Jogador>();
        jogadores2.add(new Jogador("Hugo Lloris", "Jogador", "França", "Goleiro", false));
        jogadores2.add(new Jogador("Lucas Hernández", "Jogador", "França", "Goleiro", true));
        jogadores2.add(new Jogador("Jules Koundé", "Jogador", "França", "Zageiro", false));
        jogadores2.add(new Jogador("Presnel Kimpembe", "Jogador", "França", "Lateral direito", false));
        jogadores2.add(new Jogador("Theo Hernández", "Jogador", "França", "Lateral esquerdo", false));
        jogadores2.add(new Jogador("N'Golo Kanté", "Jogador", "França", "Meio campo", false));
        jogadores2.add(new Jogador("Paul Pogba", "Jogador", "França", "Meio esquerdo", false));
        jogadores2.add(new Jogador("Adrien Rabiot", "Jogador", "França", "Meio direito", false));
        jogadores2.add(new Jogador("Kylian Mbappé", "Jogador", "França", "Atacante direito", false));
        jogadores2.add(new Jogador("Antoine Griezmann", "Jogador", "França", "Atacante", false));
        jogadores2.add(new Jogador("Karin Benzema", "Jogador", "França", "Atacante esquerdo", false));
        jogadores2.add(new Jogador("Benjamin Pavard", "Jogador", "França", "Ponta esquerda", true));
        jogadores2.add(new Jogador("Aurélien Tchouaméni", "Jogador", "França", "Zagueiro", true));
        jogadores2.add(new Jogador("Wissam Ben Yedder", "Jogador", "França", "Volante", true));
        
        
        ArrayList<Equipe> equipes = new ArrayList<Equipe>(); // Equipes
        equipes.add(new Equipe("Primeira divisão", "Gales", jogadores1, tecnicos.get(0)));
        equipes.add(new Equipe("Primeira divisão", "França", jogadores2, tecnicos.get(1)));


        ArrayList<Jogo> jogos = new ArrayList<Jogo>(); // Jogos
        jogos.add(new Jogo("02/04/2023", "18:00", "Lusail Stadium", arbitros.get(0), equipes.get(0), equipes.get(1)));
        jogos.add(new Jogo("20/04/2023", "18:00", "Lusail Stadium", arbitros.get(1), equipes.get(1), equipes.get(0)));


        jogos.get(0).scheduleGame();
        jogos.get(1).scheduleGame();
        /*System.out.println(jogos.get(0).showTeams());
        System.out.println(jogos.get(0).showScore(equipes.get(0), 0, equipes.get(1), 0));
        System.out.println(equipes.toString());
        System.out.println(jogos.get(0).showScore(equipes.get(0), 2, equipes.get(1), 0));
        System.out.println(equipes.toString());*/

        ArrayList<Rodada> rodadas = new ArrayList<Rodada>(); // Rodadas
        rodadas.add(new Rodada(1, 2022, jogos));

    
        ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
        campeonatos.add(new Campeonato(1, "Copinha", 2022, Tipo_camp.PRIMEIRA_DIVISAO, rodadas));
       
        System.out.println(campeonatos.get(0).consultChampionship(campeonatos, 1));
    }
}
