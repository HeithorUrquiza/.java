import java.util.Locale;

public class Fix1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome = "Maria de Souza";
        String prod1 = "Computador";
        String prod2 = "Relogio";

        int idade = 28;
        int codigo = 1234;

        char sex = 'F';

        double preco1 = 5900.18;
        double preco2 = 415.25;

        System.out.println("*** Dados do(a) comprador(a) ***");
        System.out.println("  Nome: " + nome);
        System.out.println("  Idade: " + idade);
        System.out.println("  Código: " + codigo);
        System.out.println("  Sexo: " + sex);
        System.out.println("\n*** Lista de Produtos ***");
        System.out.println("  Produto 1: " + prod1 + " | Preço: R$ " + preco1);
        System.out.println("  Produto 2: " + prod2 + "    | Preço: R$ " + preco2);
        System.out.println("\n*** Valor Total das Compras ***");
        System.out.printf("  R$ %.2f ", (preco1 + preco2));
    }
}
