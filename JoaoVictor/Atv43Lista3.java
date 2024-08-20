package JoaoVictor;
import java.util.Scanner;

public class Atv43Lista3 {
        public static void main(String[] args) {
            int quantidadeValores = 500;
            double[] valores = recebeValores(quantidadeValores);
            double media = calcularMedia(valores);

            System.out.println("A média aritmética dos valores fornecidos é: " + media);
        }

        public static double[] recebeValores(int qtd) {
            Scanner scanner = new Scanner(System.in);
            double[] valores = new double[qtd];

            System.out.println("Informe " + qtd + " valores:");

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

