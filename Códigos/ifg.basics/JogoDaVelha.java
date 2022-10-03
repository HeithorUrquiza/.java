import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char boardScr[][] = new char[3][3]; 
        char turn;
        int biss = 0, pl, x, y, winX = 0, winO = 0, tied = 0;

        System.out.println(" *** JOGO DA VELHA ***");
        System.out.print("\nInsira o nome do jogador 1: ");
        String playerOne = input.nextLine();
        System.out.print("Insira o nome do jogador 2: ");
        String playerTwo = input.nextLine();

        do {
            int count = 0, player = 1, play = 0;
            for (int c = 0; c < 3; c++){
                for (int j = 0; j < 3; j++){
                    boardScr[c][j] = '\u0000'; 
                }
            }

            do {
                System.out.print("\nQual jogador será o X? [1/2] ");
                pl = input.nextInt();

                if (pl == 1) {
                    System.out.printf(
                            "\nO jogador 1 (%s) foi definido como 'X', enquanto o jogador 2 (%s) foi defindo como 'O'\n",
                            playerOne, playerTwo);
                } else if (pl == 2) {
                    System.out.printf(
                            "\nO jogador 2 (%s) foi definido como 'X', enquanto o jogador 1 (%s) foi defindo como 'O'\n",
                            playerTwo, playerOne);
                } else {
                    System.out.println("\nOpção inválida");
                }

            } while (pl != 1 && pl != 2);

            do {

                System.out.println("\n   *** Tabela de Jogo ***\n");
                System.out.println("        0    1    2\n");
                System.out.printf("   0      %s | %s | %s\n", boardScr[0][0], boardScr[0][1], boardScr[0][2]);
                System.out.println("       -------------");
                System.out.printf("   1      %s | %s | %s\n", boardScr[1][0], boardScr[1][1], boardScr[1][2]);
                System.out.println("       -------------");
                System.out.printf("   2      %s | %s | %s\n", boardScr[2][0], boardScr[2][1], boardScr[2][2]);

                do {
                    if (player == 1) {
                        turn = 'X';
                    } else {
                        turn = 'O';
                    }
                    System.out.printf("\nJogador %s", turn);
                    System.out.print("\nDigite a linha que deseja jogar: ");
                    x = input.nextInt();
                    System.out.print("Digite a coluna que deseja jogar: ");
                    y = input.nextInt();
                } while (x < 0 || x > 2 || y < 0 || y > 2 || boardScr[x][y] != '\u0000');

                if (player == 1) {
                    boardScr[x][y] = 'X';
                    player++;
                } else {
                    boardScr[x][y] = 'O';
                    player = 1;
                }
                play++;

                System.out.println("\n_____________________________________________________");

                // ganhou por liunha
                if (boardScr[0][0] == 'X' && boardScr[0][1] == 'X' && boardScr[0][2] == 'X' ||
                        boardScr[1][0] == 'X' && boardScr[1][1] == 'X' && boardScr[1][2] == 'X' ||
                        boardScr[2][0] == 'X' && boardScr[2][1] == 'X' && boardScr[2][2] == 'X') {
                    System.out.println("\n *** Parabéns!! O jogador 'X' venceu esta partida ***");
                    count = 1;
                    winX++;
                }

                if (boardScr[0][0] == 'O' && boardScr[0][1] == 'O' && boardScr[0][2] == 'O' ||
                        boardScr[1][0] == 'O' && boardScr[1][1] == 'O' && boardScr[1][2] == 'O' ||
                        boardScr[2][0] == 'O' && boardScr[2][1] == 'O' && boardScr[2][2] == 'O') {
                    System.out.println("\n *** Parabéns!! O jogador 'O' venceu esta partida *** ");
                    count = 1;
                    winO++;
                }

                // ganhou por coluna
                if (boardScr[0][0] == 'X' && boardScr[1][0] == 'X' && boardScr[2][0] == 'X' ||
                        boardScr[0][1] == 'X' && boardScr[1][1] == 'X' && boardScr[2][1] == 'X' ||
                        boardScr[0][2] == 'X' && boardScr[1][2] == 'X' && boardScr[2][2] == 'X') {
                    System.out.println("\n *** Parabéns!! O jogador 'X' venceu esta partida ***");
                    count = 1;
                    winX++;
                }

                if (boardScr[0][0] == 'O' && boardScr[1][0] == 'O' && boardScr[2][0] == 'O' ||
                        boardScr[0][1] == 'O' && boardScr[1][1] == 'O' && boardScr[2][1] == 'O' ||
                        boardScr[0][2] == 'O' && boardScr[1][2] == 'O' && boardScr[2][2] == 'O') {
                    System.out.println("\n *** Parabéns!! O jogador 'O' venceu esta partida ***");
                    count = 1;
                    winO++;
                }

                // ganhou na diagonal principal
                if (boardScr[0][0] == 'X' && boardScr[1][1] == 'X' && boardScr[2][2] == 'X') {
                    System.out.println("\n *** Parabéns!! O jogador 'X' venceu esta partida ***");
                    count = 1;
                    winX++;
                }

                if (boardScr[0][0] == 'O' && boardScr[1][1] == 'O' && boardScr[2][2] == 'O') {
                    System.out.println("\n *** Parabéns!! O jogador 'O' venceu esta partida ***");
                    count = 1;
                    winO++;
                }

                // ganhou na diagonal secundaria
                if (boardScr[0][2] == 'X' && boardScr[1][1] == 'X' && boardScr[2][0] == 'X') {
                    System.out.println("\n *** Parabéns!! O jogador 'X' venceu esta partida ***");
                    count = 1;
                    winX++;
                }

                if (boardScr[0][2] == 'O' && boardScr[1][1] == 'O' && boardScr[2][0] == 'O') {
                    System.out.println("\n *** Parabéns!! O jogador 'O' venceu esta partida *** ");
                    count = 1;
                    winO++;
                }

            } while (count == 0 && play < 9);

            if (count == 0) {
                System.out.println("\n *** Deu velha hein!!! kkkk ***");
                tied++;
            }

            System.out.println("\n    *** Resultado ***\n");
            System.out.println("        0    1    2\n");
            System.out.printf("   0     %s | %s | %s\n", boardScr[0][0], boardScr[0][1], boardScr[0][2]);
            System.out.println("       -------------");
            System.out.printf("   1     %s | %s | %s\n", boardScr[1][0], boardScr[1][1], boardScr[1][2]);
            System.out.println("       -------------");
            System.out.printf("   2     %s | %s | %s\n", boardScr[2][0], boardScr[2][1], boardScr[2][2]);

            System.out.print("\n___ Desejam jogar novamente? Se sim digite 1, caso contrário 2: ");
            biss = input.nextInt();
        } while (biss == 1);

        System.out.println("\n --- ! PLACAR ! ---");
        System.out.println("\nO jogador 'X' ganhour " + winX + " vez(es)");
        System.out.println("O jogador 'O' ganhou " + winO + " vez(es)");
        System.out.println(tied + " vez(es) foi/foram empate\n");

        input.close();
    }
}
