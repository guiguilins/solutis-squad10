package Daniel;

import java.util.Scanner;

public class Atv19Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2);
        } else if (num1 > num2) {
            System.out.println("Ordem crescente: " + num2 + ", " + num1);
        } else {
            System.out.println("Os números são iguais: " + num1 + ", " + num2);
        }

        sc.close();
    }
}
