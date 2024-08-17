package Guilherme;

import java.util.Scanner;

public class atv3Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de homens: ");
        int homens = sc.nextInt();
        System.out.print("Informe a quantidade de mulheres: ");
        int mulheres = sc.nextInt();

        double totalAlunos = (double) homens + (double) mulheres;
        double porcentagemHomens = (double) homens / totalAlunos * 100;
        double porcentagemMulheres = (double) mulheres / totalAlunos * 100;

        System.out.printf("Existem %.2f%% de homens e %.2f%% mulheres: ", porcentagemHomens, porcentagemMulheres);
    }
}
