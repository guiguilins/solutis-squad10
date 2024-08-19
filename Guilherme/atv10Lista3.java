package Guilherme;

import java.util.Scanner;

public class atv10Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salario bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Informe o valor dos descontos: ");
        double descontos = sc.nextDouble();
        System.out.print("Informe o valor do possível emprestimo: ");
        double emprestimo = sc.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = salarioLiquido * 0.30;

        if (emprestimo <= valorMaximoEmprestimo) {
            System.out.println("Emprestimo aprovado.");
        } else {
            System.out.println("Emprestimo nao aprovado.");
        }
    }
}
