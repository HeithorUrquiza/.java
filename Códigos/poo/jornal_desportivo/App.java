import classes.*;
import classes.Pessoas.Equipe;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Campeonato camp = new Campeonato(0001, 2022, "CAMPEONATO 1", TipoCampeonato.PRIMEIRA_DIVISAO, null);
        String tipoDoCamp = new String();
        tipoDoCamp = camp.getTipoC().getTipo();
        List<Rodada> a = camp.getRodadas();

        Arbitro adilson = new Arbitro("Adilson", "Juiz");
        Jogador mosca = new Jogador("Lucas Moscardini", "Jogador", "Brasileiro", "Atacante", false);

        adilson.apitar();
        adilson.aplicarPenalidade(mosca);
        adilson.aplicarPenalidade(mosca);
        adilson.aplicarPenalidade(mosca);
        
        Equipe manchester = new Equipe("Manchester City", TipoCampeonato.PRIMEIRA_DIVISAO, 0, 2, 3);
        manchester.adicionarTecnico("robinho");

        Equipe noedo = new Equipe("ODEON", TipoCampeonato.REGIONAL, 0, 0, 0);
        noedo.adicionarTecnico("Edgar CIA.");
        noedo.adicionarJogador("Mosca", "BR", "ZAGA", true);

        Equipe axty = new Equipe("AXTY", TipoCampeonato.REGIONAL, 0, 0, 0);
        axty.adicionarTecnico("Edgar CIA.");
        axty.adicionarJogador("Mosca", "BR", "ZAGA", true);

        Rodada novaRod = new Rodada(1, 2022);
        novaRod.marcarJogo(noedo, axty, "12/12/2022", "FUNDIÇÃO", null);
        novaRod.jogo.get(0).marcarPontoVisitada();
        novaRod.jogo.get(0).marcarPontoVisitada();
        novaRod.jogo.get(0).marcarPontoVisitante();
        novaRod.jogo.get(0).coletarResultado();
        */

        Campeonato camp = new Campeonato(1, 2022, "Campeonato IFG de Orientação a Objetos: Edição Leandro me dá nota", TipoCampeonato.PRIMEIRA_DIVISAO);
        
        camp.adicionarArbitro("Syd Barrett", "Juiz de Campo");
        camp.adicionarArbitro("Stuart Sutcliff", "Juiz");

        camp.adicionarEquipe("Fluído Rosa", 0, 0, 0);
        camp.adicionarEquipe("Led Dirigível", 0, 0, 0);
        camp.adicionarEquipe("Rolling Pedras", 0, 0, 0);
        camp.adicionarEquipe("As Portas", 0, 0, 0);
        camp.adicionarEquipe("Rainha", 0, 0, 0);
        camp.adicionarEquipe("Experiência João Hendrix", 0, 0, 0);
        camp.adicionarEquipe("Beatidos", 0, 0, 0);

        Equipe tool = new Equipe("Ferramenta", 0, 0, 0);
        Equipe dreamTheater = new Equipe("Teatro dos Sonhos", 0, 0, 0);
        Equipe kingCrimson = new Equipe("Rei Carmesim", 0, 0, 0);
        Equipe rush = new Equipe("Correria", 0, 0, 0);

        camp.adicionarEquipe("Noedo", 0, 0, 0);
        camp.adicionarEquipe("Ansiedade", 0, 0, 0);
        camp.adicionarEquipe("Vitalismo", 0, 0, 0);
        camp.adicionarEquipe("Intervalos", 0, 0, 0);
        camp.adicionarEquipe("Me alimente, Jack", 0, 0, 0);
        camp.adicionarEquipe("Immerço", 0, 0, 0);
        camp.adicionarEquipe("Não Processado", 0, 0, 0);
        camp.adicionarEquipe("Refrigerante Violeta", 0, 0, 0);
        camp.adicionarEquipe("Amor Ruim", 0, 0, 0);
        camp.adicionarEquipe("Ruína de bala", 0, 0, 0);

        camp.getEquipes().get(0).adicionarTecnico("Rogério Águas");
        camp.getEquipes().get(1).adicionarTecnico("Peter Grant");
        camp.getEquipes().get(6).adicionarTecnico("Brian Epstein");
        camp.getEquipes().get(8).adicionarTecnico("Ed. Garcia");

        camp.adicionarRodadas(1, 1969);
        camp.adicionarRodadas(2, 1986);
        camp.adicionarRodadas(3, 2014);
        camp.adicionarRodadas(4, 2022);

        camp.getRodadas().get(0).marcarJogo(camp.getEquipes().get(0), camp.getEquipes().get(5), "16/08/1969", "Woodstock", camp.getArbtr().get(0));
        camp.getRodadas().get(0).marcarJogo(camp.getEquipes().get(1), camp.getEquipes().get(2), "17/09/1970", "Hyde Park", camp.getArbtr().get(1));
        camp.getRodadas().get(0).marcarJogo(camp.getEquipes().get(2), camp.getEquipes().get(3), "17/01/1968", "Budokkan", camp.getArbtr().get(1));
        camp.getRodadas().get(0).marcarJogo(camp.getEquipes().get(4), camp.getEquipes().get(6), "27/01/1968", "Royal Albert Hall", camp.getArbtr().get(0));
        
        camp.getRodadas().get(1).marcarJogo(rush, kingCrimson, "07/09/1972", "Madison Square Garden", camp.getArbtr().get(0));
        camp.getRodadas().get(1).marcarJogo(tool, dreamTheater, "09/09/1999", "Madison Square Garden", camp.getArbtr().get(0));
        camp.getRodadas().get(1).marcarJogo(dreamTheater, rush, "07/09/1972", "Madison Square Garden", camp.getArbtr().get(0));
        camp.getRodadas().get(1).marcarJogo(dreamTheater, camp.getEquipes().get(0), "esse não tem nem possibilidade", "Madison Square Garden", camp.getArbtr().get(1));

        camp.getRodadas().get(2).marcarJogo(camp.getEquipes().get(7), camp.getEquipes().get(8), "11/04/2022", "Hangar 110", camp.getArbtr().get(1));
        camp.getRodadas().get(2).marcarJogo(camp.getEquipes().get(8), camp.getEquipes().get(16), "16/06/2022", "Circo Voador", camp.getArbtr().get(1));
        camp.getRodadas().get(2).marcarJogo(camp.getEquipes().get(10), camp.getEquipes().get(11), "26/05/2014", "Circo Voador", camp.getArbtr().get(1));
        camp.getRodadas().get(2).marcarJogo(camp.getEquipes().get(9), camp.getEquipes().get(14), "29/07/2019", "Circo Voador", camp.getArbtr().get(0));
        
        camp.getRodadas().get(3).marcarJogo(camp.getEquipes().get(12), camp.getEquipes().get(16), "19/07/2021", "Fabrique Club", camp.getArbtr().get(1));
        camp.getRodadas().get(3).marcarJogo(camp.getEquipes().get(15), camp.getEquipes().get(14), "18/06/2021", "VK Club", camp.getArbtr().get(1));
        camp.getRodadas().get(3).marcarJogo(camp.getEquipes().get(15), camp.getEquipes().get(13), "08/06/2019", "Algum lugar em Tel Aviv", camp.getArbtr().get(1));
        camp.getRodadas().get(3).marcarJogo(camp.getEquipes().get(8), camp.getEquipes().get(11), "nem chance", "Fundição Progresso", camp.getArbtr().get(0));

        camp.getRodadas().get(0).jogo.get(0).exibirEquipes(kingCrimson, rush);
        camp.getRodadas().get(3).jogo.get(0).exibirEquipes(camp.getEquipes().get(7), camp.getEquipes().get(8));

        camp.getEquipes().get(0).adicionarJogador("Roger Waters", "Inglês", "Zaga", true);
        camp.getEquipes().get(0).adicionarJogador("David Gilmour", "Inglês", "Ataque", true);
        camp.getEquipes().get(0).adicionarJogador("Richard Wright", "Inglês", "Zaga", false);
        camp.getEquipes().get(0).adicionarJogador("Nick Mason", "Inglês", "Gol", true);
        
        camp.getEquipes().get(1).adicionarJogador("Robert Plant", "Inglês", "Ataque", true);
        camp.getEquipes().get(1).adicionarJogador("Jimmy Page", "Inglês", "Ataque", true);
        camp.getEquipes().get(1).adicionarJogador("John Paul Jones", "Inglês", "Ataque", true);
        camp.getEquipes().get(1).adicionarJogador("John Bonham", "Inglês", "Ataque", true);
        
        camp.getEquipes().get(2).adicionarJogador("Mick Jagger", "Inglês", "Ataque", true);
        camp.getEquipes().get(2).adicionarJogador("Keith Richards", "Inglês", "Zaga", true);
        camp.getEquipes().get(2).adicionarJogador("Bill Wyman", "Inglês", "Zaga", true);
        camp.getEquipes().get(2).adicionarJogador("Brian Jones", "Inglês", "Zaga", false);
        camp.getEquipes().get(2).adicionarJogador("Mick Taylor", "Inglês", "Ataque", false);
        camp.getEquipes().get(2).adicionarJogador("Charlie Watts", "Inglês", "Gol", true);
        
        camp.getEquipes().get(3).adicionarJogador("Jim Morrison", "Norte-Americano Arrependido", "Ataque", true);
        camp.getEquipes().get(3).adicionarJogador("John Densmore", "Norte-Americano", "Gol", true);
        camp.getEquipes().get(3).adicionarJogador("Ray Manzarek", "Norte-Americano", "Ataque", true);
        camp.getEquipes().get(3).adicionarJogador("Robby Krieger", "Norte-Americano", "Zaga", true);
        
        camp.getEquipes().get(4).adicionarJogador("Freddie Mercury", "Tanzaniano por incrível que pareça", "Ataque", true);
        camp.getEquipes().get(4).adicionarJogador("Brian May", "Inglês", "Ataque", true);
        camp.getEquipes().get(4).adicionarJogador("John Deacon", "Inglês", "Zaga", true);
        camp.getEquipes().get(4).adicionarJogador("Roger Taylor", "Inglês", "Gol", true);
        
        camp.getEquipes().get(5).adicionarJogador("Jimi Hendrix", "Norte-Americano", "Ataque", true);
        
        camp.getEquipes().get(6).adicionarJogador("Paul McCartney", "Inglês", "Zaga", true);
        camp.getEquipes().get(6).adicionarJogador("John Lennon", "Inglês", "Ataque", true);
        camp.getEquipes().get(6).adicionarJogador("George Harrison", "Inglês", "Zaga", true);
        camp.getEquipes().get(6).adicionarJogador("Richard Starkey", "Inglês", "Gol", true);

        tool.adicionarJogador("Justin Chancellor", "Inglês", "Ataque", true);
        tool.adicionarJogador("Maynard James Keenan", "N. Americano", "Ataque", true);
        tool.adicionarJogador("Adam Jones", "N. Americano", "zaga", true);
        tool.adicionarJogador("Danny Carey", "N. Americano", "zaga", true);

        dreamTheater.adicionarJogador("LaBrie", "Americano", "Ataque", false);
        dreamTheater.adicionarJogador("Mike Portnoy", "N. Americano", "Gol", true);
        dreamTheater.adicionarJogador("John Petrucci", "N. Americano", "Ataque", true);
        dreamTheater.adicionarJogador("John Myung", "N. Americano", "Ataque", true);
        dreamTheater.adicionarJogador("Jordan Rudess", "N. Americano", "zaga", true);

        camp.getRodadas().get(0).jogo.get(0).marcarPontoVisitada();
        camp.getRodadas().get(0).jogo.get(0).marcarPontoVisitada();
        camp.getRodadas().get(0).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(0).exibirPlacar();

        camp.getRodadas().get(0).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(1).marcarPontoVisitada();
        camp.getRodadas().get(0).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(1).exibirPlacar();

        camp.getRodadas().get(0).jogo.get(2).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(2).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(2).exibirPlacar();

        camp.getRodadas().get(0).jogo.get(3).marcarPontoVisitada();
        camp.getRodadas().get(0).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(0).jogo.get(3).exibirPlacar();



        camp.getRodadas().get(1).jogo.get(0).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(0).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(0).exibirPlacar();

        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(1).exibirPlacar();


        camp.getRodadas().get(1).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(2).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(2).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(2).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(2).exibirPlacar();


        camp.getRodadas().get(1).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(3).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(1).jogo.get(3).marcarPontoVisitada();
        camp.getRodadas().get(1).jogo.get(3).exibirPlacar();




        camp.getRodadas().get(2).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(0).exibirPlacar();


        camp.getRodadas().get(2).jogo.get(1).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(1).exibirPlacar();

        camp.getRodadas().get(2).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(2).exibirPlacar();

        camp.getRodadas().get(2).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(1).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(2).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(2).jogo.get(2).exibirPlacar();



        camp.getRodadas().get(3).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(3).jogo.get(0).marcarPontoVisitante();
        camp.getRodadas().get(3).jogo.get(0).marcarPontoVisitada();
        camp.getRodadas().get(3).jogo.get(0).exibirPlacar();

        camp.getRodadas().get(3).jogo.get(1).marcarPontoVisitante();
        camp.getRodadas().get(3).jogo.get(1).marcarPontoVisitada();
        camp.getRodadas().get(3).jogo.get(1).exibirPlacar();

        camp.getRodadas().get(3).jogo.get(2).marcarPontoVisitada();
        camp.getRodadas().get(3).jogo.get(2).exibirPlacar();

        camp.getRodadas().get(3).jogo.get(3).marcarPontoVisitada();
        camp.getRodadas().get(3).jogo.get(3).marcarPontoVisitante();
        camp.getRodadas().get(3).jogo.get(3).exibirPlacar();


        System.out.println(tool.jogadores.get(1).isTitular());

        camp.getArbtr().get(0).aplicarPenalidade(tool.jogadores.get(1));
        camp.getArbtr().get(0).apitar();
        camp.getArbtr().get(0).aplicarPenalidade(tool.jogadores.get(1));
        camp.getArbtr().get(0).aplicarPenalidade(tool.jogadores.get(1));


        System.out.println(tool.jogadores.get(1).isTitular());

        camp.consultarRod(1);
        camp.consultarRod(2);
        camp.consultarRod(3);
        camp.consultarRod(4);



        camp.getRodadas().get(0).jogo.get(0).coletarResultado();
        camp.getRodadas().get(0).jogo.get(1).coletarResultado();
        camp.getRodadas().get(0).jogo.get(2).coletarResultado();
        camp.getRodadas().get(0).jogo.get(3).coletarResultado();

        camp.getRodadas().get(1).jogo.get(0).coletarResultado();
        camp.getRodadas().get(1).jogo.get(1).coletarResultado();
        camp.getRodadas().get(1).jogo.get(2).coletarResultado();
        camp.getRodadas().get(1).jogo.get(3).coletarResultado();

        camp.getRodadas().get(2).jogo.get(0).coletarResultado();
        camp.getRodadas().get(2).jogo.get(1).coletarResultado();
        camp.getRodadas().get(2).jogo.get(2).coletarResultado();
        camp.getRodadas().get(2).jogo.get(3).coletarResultado();

        camp.getRodadas().get(3).jogo.get(0).coletarResultado();
        camp.getRodadas().get(3).jogo.get(1).coletarResultado();
        camp.getRodadas().get(3).jogo.get(2).coletarResultado();
        camp.getRodadas().get(3).jogo.get(3).coletarResultado();

        camp.exibirClassif();
        
        

        
    }
}
