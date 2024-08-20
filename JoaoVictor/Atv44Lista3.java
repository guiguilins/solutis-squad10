package JoaoVictor;
import java.util.Scanner;

public class Atv44Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int quantidadeValores = scanner.nextInt();

        double[] valores = recebeValores(quantidadeValores);
        double media = calcularMedia(valores);

        System.out.println("A média aritmética dos valores fornecidos é: " + media);
    }

    public static double[] recebeValores(int qtd) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[qtd];

        System.out.println("Agora informe os " + qtd + " valores:");

        for (int i = 0; i < qtd; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }
        return valores;
    }

    public static double calcularMedia(double[] valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}

