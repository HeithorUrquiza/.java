package poo.pessoa_heranca;

public class app {
    public static void main(String[] args) {
        Aluno p2 = new Aluno("Maria", 15, "F", 202145, "Inglês");
        Professor p3 = new Professor("João", 32, "M", "Educação Física", 1800.00);
        Funcionario p4 = new Funcionario("Renata", 65, "F", "Cozinha");
        Bolsista p5 = new Bolsista("Claúdio", 22, "M", 20223636, "Informática");

        p2.payMonth();
        p3.increaseSal(200.00);
        System.out.println(p3.info());
        p4.changeWork();
        System.out.println(p4.info());
        p5.payMonth();
        System.out.println("\n");
    }
}
