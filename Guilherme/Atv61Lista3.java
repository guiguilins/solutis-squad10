package Guilherme;

import java.util.Scanner;

public class Atv61Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int asterisco = 1; asterisco <= i; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
