import java.util.Scanner;

public class ContagemRegulada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        //Titúlo
        System.out.println("\n *** Contagem Regulada ***");
        //Entrada de dados
        System.out.print("\nInforme o valor inicial: ");
        int start = input.nextInt();
        System.out.print("Informe o valor final: ");
        int end = input.nextInt();
        System.out.print("Quantidade de passos: ");
        int step = input.nextInt();

        input.close();

        //Contagem
        for (i = start; i <= end; i+=step ){
            System.out.println(i);
        }

    }
}
