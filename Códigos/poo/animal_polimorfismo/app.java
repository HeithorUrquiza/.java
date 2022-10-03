package poo.animal_polimorfismo;

public class app {
    public static void main(String[] args) {
        Mamifero m = new Mamifero(75.9, 6, 4, "Marrom");
        m.emitirSom();
        m.alimentar();
        m.locomover();

        /*Ave a = new Ave(2.56, 1, 2, "Branco com cinza");
        System.out.println("\n");
        a.emitirSom();
        a.locomover();
        a.alimentar();*/

        System.out.println("\n");
        Cachorro c = new Cachorro(56.9, 3, 4, "Branco e preto");
        c.alimentar();
        c.locomover();
        c.emitirSom();
    }
}
