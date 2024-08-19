package Guilherme;

import java.util.Scanner;

public class atv5Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor inicial do débito: ");
        double valor = sc.nextDouble();
        System.out.print("Informe a quantidade de meses: ");
        int meses = sc.nextInt();
        System.out.print("Informe os juros mensais: ");
        double jurosMensais = sc.nextDouble();

        double jurosSimples = (valor * (jurosMensais / 100) * meses);
        double montante = valor + jurosSimples;

        System.out.println("O valor final da divida: " + montante);
    }
}
