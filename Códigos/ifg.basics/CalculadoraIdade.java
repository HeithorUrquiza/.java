import java.util.Scanner;
import java.time.LocalDate;

public class CalculadoraIdade{
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
            LocalDate data = LocalDate.now();
            
            int ano = data.getYear();
            int n;

            System.out.print("Informe seu ano de nascimento: ");
            n = ler.nextInt();
            System.out.printf("Sua idade é %d\n", ano - n);
        }
    }
}