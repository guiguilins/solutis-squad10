package Karen;

import java.util.Scanner;

public class Atv61Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas deseja imprimir na pirâmide de asteriscos? ");
        int quantidadeLinhas = scanner.nextInt();

        for (int i = 1; i <= quantidadeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}