
import java.util.Scanner;

public class CadastroEx4 {
    public static void main(String[] args) {
        String name1, name2, name3;
        String cpf1, cpf2, cpf3;
        String email1, email2, email3, consulta;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        name1 = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf1 = input.nextLine();
        System.out.print("Digite o email: ");
        email1 = input.nextLine();
        System.out.print("Digite o nome: ");
        name2 = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf2 = input.nextLine();
        System.out.print("Digite o email: ");
        email2 = input.nextLine();
        System.out.print("Digite o nome: ");
        name3 = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf3 = input.nextLine();
        System.out.print("Digite o email: ");
        email3 = input.nextLine();

        System.out.print("Para a consulta, informe o cpf: ");
        consulta = input.nextLine();

        if (consulta.equals(cpf1)){
            System.out.println(name1);
            System.out.println(cpf1);
            System.out.println(email1);
        } else if (consulta.equals(cpf2)){
            System.out.println(name2);
            System.out.println(cpf2);
            System.out.println(email2);;
        } else if (consulta.equals(cpf3)) {
            System.out.println(name3);
            System.out.println(cpf3);
            System.out.println(email3);
        } else {
            System.out.println("CPF inexistente");
        }

        input.close();
    }
}