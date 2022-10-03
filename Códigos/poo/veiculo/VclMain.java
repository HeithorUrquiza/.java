package poo.veiculo;

import java.util.Scanner;

public class VclMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Veiculo carro;
        carro = new Veiculo("Carro", "Civic", "Honda", "CBL9087", "Flex", 14.0, 
            44.0, "Preto", 180.0, "Terra e asfalto");
        
        //System.out.println(carro.toString());

        boolean startCar = false;
        startCar = carro.ligarVcl(carro.getQtdCombustivel());

        if(startCar){
            boolean bateria = false;
            System.out.print("Confirme o estado da bateria [1 - Funcional / 0 - Sem carga]: ");
            bateria = carro.checkBateria(input.nextInt());

            if(bateria){
                System.out.println("\nVrum vrum !!....");
            } else {
                System.out.println("\nFalha na partifa ");
            }
        } else {
            System.out.println("\nSem combustível! \nAbasteça seu carro!!");
        }

        input.close();
    }
}
