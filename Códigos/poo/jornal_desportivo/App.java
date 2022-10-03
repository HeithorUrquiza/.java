package poo.jornal_desportivo;

public class App {
    public static void main(String[] args) {
        
        Jogador j1[] = new Jogador[14]; // Vetor para jogadores 1
        j1[0] = new Jogador("Danny Ward", "País de Gales", "Goleiro", false);
        j1[1] = new Jogador("Wayne Hennessey", "País de Gales", "Goleiro", true);
        j1[2] = new Jogador("Ben Davies", "País de Gales", "Zageiro", false);
        j1[3] = new Jogador("Chris Mepham", "País de Gales", "Lateral direito", false);
        j1[4] = new Jogador("Connor Roberts", "País de Gales", "Lateral esquerdo", false);
        j1[5] = new Jogador("Joe Morrell", "País de Gales", "Meio campo", false);
        j1[6] = new Jogador("Aaron Ramsey", "País de Gales", "Meio esquerdo", false);
        j1[7] = new Jogador("Harry Wilson", "País de Gales", "Meio direito", false);
        j1[8] = new Jogador("Gareth Bale", "País de Gales", "Atacante direito", false);
        j1[9] = new Jogador("Kieffer Moore", "País de Gales", "Atacante", false);
        j1[10] = new Jogador("Daniel James", "País de Gales", "Atacante esquerdo", false);
        j1[11] = new Jogador("Brennan Johnson", "País de Gales", "Ponta esquerda", true);
        j1[12] = new Jogador("Neco Williams", "País de Gales", "Zagueiro", true);
        j1[13] = new Jogador("Jonatham Williams", "País de Gales", "Volante", true);

        Jogador j2[] = new Jogador[14]; // Vetor para jogador 2
        j2[0] = new Jogador("Hugo Lloris", "França", "Goleiro", false);
        j2[1] = new Jogador("Lucas Hernández", "França", "Goleiro", true);
        j2[2] = new Jogador("Jules Koundé", "França", "Zageiro", false);
        j2[3] = new Jogador("Presnel Kimpembe", "França", "Lateral direito", false);
        j2[4] = new Jogador("Theo Hernández", "França", "Lateral esquerdo", false);
        j2[5] = new Jogador("N'Golo Kanté", "França", "Meio campo", false);
        j2[6] = new Jogador("Paul Pogba", "França", "Meio esquerdo", false);
        j2[7] = new Jogador("Adrien Rabiot", "França", "Meio direito", false);
        j2[8] = new Jogador("Kylian Mbappé", "França", "Atacante direito", false);
        j2[9] = new Jogador("Antoine Griezmann", "França", "Atacante", false);
        j2[10] = new Jogador("Karin Benzema", "França", "Atacante esquerdo", false);
        j2[11] = new Jogador("Benjamin Pavard", "França", "Ponta esquerda", true);
        j2[12] = new Jogador("Aurélien Tchouaméni","França", "Zagueiro", true);
        j2[13] = new Jogador("Wissam Ben Yedder", "França", "Volante", true);

        Equipe e[] = new Equipe[2]; // Vetor para equipes
        e[0] = new Equipe("Primeira divisão", "Waller", j1, "Kkami");
        e[1] = new Equipe("Primeira divisão", "France", j2, "Josué");

        Jogo pl[] = new Jogo[3]; // Vetor para jogos
        pl[0] = new Jogo("20/04/2023", "18:00", "Lusail Stadium", "Fahad", e[0], e[1]);
        pl[1] = new Jogo("01/05/2023", "19:00", "Al Thumama Stadium", "Hussaim", e[1], e[0]);
        pl[2] = new Jogo("17/05/2023", "20:00", "Stadium 974", "Muhammed", e[0], e[1]);

        pl[0].scheduleGame();
        pl[1].scheduleGame();
        pl[2].scheduleGame();

        Campeonato cp = new Campeonato("Copinha", pl);
        System.out.println(cp.rounds());

        System.out.println(pl[0].showTeams());
        System.out.println(pl[0].showScore(e[1], 2, e[0], 1));

        e[0].demoteTeam();
        System.out.println(e[0].toString());
        System.out.println(e[1].toString());
        
       
    }
}
