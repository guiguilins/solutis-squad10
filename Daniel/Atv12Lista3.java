package Daniel;

import java.util.Scanner;

public class Atv12Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else if (media < 5) {
            System.out.println("Você foi reprovado.");
        } else {
            System.out.println("Você ficou em recuperação.");
        }
    }
}
