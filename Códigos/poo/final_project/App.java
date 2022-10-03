package poo.final_project;

public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Kain", 17, 'M', "kdonordeste");
        g[1] = new Gafanhoto("Bell", 20, 'F', "bebeti");
        

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].evaluate();
        vis[0].addLike();
        System.out.println(vis[0].toString());
        vis[0].evaluate(90.0);
        vis[0].evaluate(9);
        vis[0].addLike();
        vis[0].reprise();
        System.out.println(vis[0].toString());
    }
}
