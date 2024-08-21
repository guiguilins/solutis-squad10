package JoaoVictor;

import java.util.Scanner;

public class Atv65Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int qtdLinhas = scanner.nextInt();

        constroiPiramide(qtdLinhas);

        scanner.close();
    }
    public static void constroiPiramide(int qtdLinhas) {
        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 1; j <= qtdLinhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}