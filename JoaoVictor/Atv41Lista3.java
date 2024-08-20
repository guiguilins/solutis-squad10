package JoaoVictor;
import java.util.Random;
import java.util.Scanner;

public class Atv41Lista3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número sorteado entre 1 e 100!");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}
