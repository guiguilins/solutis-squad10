package JoaoVictor;
import java.util.Scanner;

public class Atv45Lista3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValores = 100;
        double[] valores = new double[quantidadeValores];

        System.out.println("Informe 100 valores:");

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double maiorValor = encontrarMaiorValor(valores);

        System.out.println("O maior valor fornecido é: " + maiorValor);
    }

    public static double encontrarMaiorValor(double[] valores) {
        double maior = valores[0];

        for (double valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }

        return maior;
    }
}
