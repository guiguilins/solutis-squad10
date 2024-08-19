package Guilherme;

import java.util.Scanner;

public class atv7Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informa sua despesa total: ");
        double despesa = sc.nextDouble();

        double comissao = despesa * 10/100;

        System.out.printf("Comissao do garcom: %.2f%n ", comissao);

    }
}
