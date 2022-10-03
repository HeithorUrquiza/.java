import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println(" *** Cálculo de Bhaskara ***");
        System.out.print("\nInforme o valor de a: ");
        a = input.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = input.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("\nA função fornecida não é um polinômio de segundo grau, logo não é aplicável para Bhaskara");
        } else {
            delta = (Math.pow(b, 2)) - 4 * a * c;
            System.out.println(delta);

            if (delta >= 0) {
                double x1, x2;
                x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
                x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
                System.out.printf("A(s) raíz(es) é(são) %.2f, %.2f", x1, x2);
            } else {
                System.out.println("Não existe raízes reais para esta equação");
            }
        }

        input.close();
    }
}
