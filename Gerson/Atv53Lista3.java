package Gerson;

import java.util.Scanner;

    /*

        53. Exiba a tabuada de um número fornecido pelo usuário. Por exemplo se ele digitar o número 5, então
    será mostrado:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50

     */
public class Atv53Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero que você deseja ver a tabuada: ");
        int nTabuada = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d X %2d = %3d%n", i, nTabuada, (i * nTabuada));
        }
        sc.close();
    }
}
