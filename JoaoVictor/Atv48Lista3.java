package JoaoVictor;
import java.util.Scanner;

public class Atv48Lista3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas serão usadas para o cálculo da média semestral? ");
        int numeroDeNotas = scanner.nextInt();
        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(notas);

        System.out.print("Digite o número de faltas: ");
        int faltas = scanner.nextInt();

        avaliarAluno(media, faltas);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void avaliarAluno(double media, int faltas) {
        int limiteFaltas = 18;
        double notaMinimaAprovacao = 7.0;

        if (faltas > limiteFaltas) {
            System.out.println("Aluno reprovado por faltas.");
        } else if (media >= notaMinimaAprovacao) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado por nota.");
        }
    }
}
