package Gerson;

import java.util.Scanner;

public class Atv65Lista3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();
        for (int i = 1; i <= linhas; i++) {
            for (int j = linhas; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

