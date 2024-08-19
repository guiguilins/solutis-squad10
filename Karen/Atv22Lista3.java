package Karen;

import java.util.Scanner;

public class Atv22Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data de aniversário:");
        System.out.print("Dia: ");
        int dia1 = scanner.nextInt();
        System.out.print("Mês: ");
        int mes1 = scanner.nextInt();

        System.out.println("Digite a segunda data de aniversário:");
        System.out.print("Dia: ");
        int dia2 = scanner.nextInt();
        System.out.print("Mês: ");
        int mes2 = scanner.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário são diferentes.");
        }

        scanner.close();
    }
}
