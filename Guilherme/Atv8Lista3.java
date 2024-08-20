package Guilherme;

import java.util.Scanner;

public class Atv8Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numerador: ");
        double numerador = sc.nextDouble();
        System.out.print("Informe o denominador: ");
        double denominador = sc.nextDouble();

        if (denominador == 0) {
            System.out.println("Erro: O denominador não pode ser zero.");
        } else {
            double numeroReal = numerador / denominador;
            System.out.printf("O número real é: %.2f%n", numeroReal);
        }
    }
}
