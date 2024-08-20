package Guilherme;


import java.util.Scanner;

public class Atv4Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Informe a nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Informe a nota 4: ");
        double nota4 = sc.nextDouble();

        double mediaTotal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Media aritmetica e: " + mediaTotal);

    }
}
