import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            float n;
            
            System.out.print("Digite um valor: ");
            n = ler.nextFloat();

            System.out.printf("\nResto da divisão por 2: %d\n", (int) n % 2);
            System.out.printf("Elevado ao Cubo: %.2f\n", Math.pow(n, 3));
            System.out.printf("Raiz Quadrada: %.2f\n", Math.sqrt(n));
            System.out.printf("Raiz Cúbica: %.2f\n", Math.cbrt(n));
            System.out.printf("Valor Absoluto: %d\n", (int) Math.abs(n));
        }
    }
}
