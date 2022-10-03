import java.util.Scanner;

public class JogoDoGenio {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = Math.random();
            int n = (int) (1 + x * (6-1)), a;

            System.out.println("Estou pensando em um número entre 1 e 5. \nTente adivinhar!");
            a = input.nextInt();
            String resp = (a == n)?"Parebéns, você acertou":"Não foi dessa vez, tente de novo";
            System.out.println(resp);
            System.out.println(n);
        }
    }
}
