package Daniel;

import java.util.Scanner;

public class Atv64Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos:");
        int triangulos = scanner.nextInt();

        for (int i = 1; i <= triangulos; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}