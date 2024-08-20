package JoaoVictor;
import java.util.Scanner;

public class Atv43Lista3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;

        System.out.println("Digite 500 valores para calcular a média aritmética:");

        for (int i = 1; i <= 500; i++) {
            System.out.print("Informe o " + i + "° valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / 500;
        System.out.printf("A média aritmética dos 500 valores é: %.2f\n", media);

        scanner.close();
    }
}
