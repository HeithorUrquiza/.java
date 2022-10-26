package poo.jornal_desportivo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
        tecnicos.add(new Tecnico("Ramalho", "Técnico"));
        tecnicos.add(new Tecnico("Bringstom", "Técnico"));
        

        ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
        arbitros.add(new Arbitro("Zeca", "Arbitragem", "Juíz"));
        arbitros.add(new Arbitro("Peralta", "Arbitragem", "Bandeirinha"));
        arbitros.add(new Arbitro("Whilliawn", "Arbitragem", "Juíz"));
        arbitros.add(new Arbitro("Ramsés", "Arbitragem", "Bandeirinha"));
        arbitros.add(new Arbitro("Ricardo", "Arbitragem", "Bandeirinha"));
        

        ArrayList<Jogador> jogadores1 = new ArrayList<Jogador>();
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



        /*Jogador j2[] = new Jogador[14]; // Vetor para jogador 2
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
        j2[13] = new Jogador("Wissam Ben Yedder", "França", "Volante", true);*/

        /*ArrayList<Equipe> equipes = new ArrayList<Equipe>();
        equipes.add(new Equipe("Segunda", "Coritiba", null, null));
        equipes.add(new Equipe("Segunda", "Salvador", null, null));


        ArrayList<Jogo> jogos = new ArrayList<Jogo>(); // Vetor para jogos
        jogos.add(new Jogo("20/04/2023", "18:00", "Lusail Stadium", null, equipes.get(0), equipes.get(1)));
        
        jogos.get(0).scheduleGame();
        Tipo_camp ty = Tipo_camp.PRIMEIRA_DIVISAO;
        System.out.println("\n" + ty);
        //System.out.println(jogos.get(0).toString());   

        /*jogos.add(new Jogo("01/05/2023", "19:00", "Al Thumama Stadium", "Hussaim", e[1], e[0]));
        jogos.add(new Jogo("17/05/2023", "20:00", "Stadium 974", "Muhammed", e[0], e[1]));

        pl[0].scheduleGame();
        pl[1].scheduleGame();
        pl[2].scheduleGame();

        Campeonato cp = new Campeonato("Copinha", pl);
        System.out.println(cp.rounds());

        System.out.println(pl[0].showTeams());
        System.out.println(pl[0].showScore(e[1], 2, e[0], 1));

        e[0].demoteTeam();
        System.out.println(e[0].toString());
        System.out.println(e[1].toString());*/
        
       
    }
}
