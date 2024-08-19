package Karen;

import java.util.Scanner;

public class Atv63Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas deseja imprimir na pirâmide de números? ");
        int quantidadeLinhas = scanner.nextInt();

        for (int i = 1; i <= quantidadeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < 10) {
                    System.out.print("0" + j + " ");
                    continue;
                } else System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}