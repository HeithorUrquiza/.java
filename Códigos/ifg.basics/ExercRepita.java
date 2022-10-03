import javax.swing.JOptionPane;

public class ExercRepita {
    public static void main(String[] args) {
        int n, s = 0, cont = 0, par = 0, impar = 0, up100 = 0;
        float med = 0f;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Insira um número: <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;
            cont++;
            if (n % 2 == 0){
                par++;
            } else {
                impar++;
            }
            
            if (n > 100) {
                up100++;
            }

            if (n == 0){
                cont--;
            }

            med = s/cont;

        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Total de Valores: " + cont + 
        "<br>Total de pares: " + (par - 1) + "<br>Total de Ímpares: " + (impar - 1) + "<br>Acima de 100: " + up100 + "<br>Média dos valores: " + med + "</html>");
    }
}