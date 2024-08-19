package Guilherme;

import java.util.Scanner;

public class Atv2Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu salario? ");
        double salario = sc.nextDouble();
        System.out.print("Qual o salario minimo atual? ");
        double salarioMinimo = sc.nextDouble();

        double quantidadeSalariosMinimos = salario / salarioMinimo;
        System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);
    }
}
