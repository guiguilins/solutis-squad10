package JoaoVictor;
import java.util.Scanner;

public class Atv50Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para obter o n-ésimo termo da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O valor de n deve ser um número positivo.");
        } else {
            long nthTerm = fibonacci(n);
            System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + nthTerm);
        }
    }

    public static long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        long a = 1, b = 1;
        long nthTerm = 1;

        for (int i = 3; i <= n; i++) {
            nthTerm = a + b;
            a = b;
            b = nthTerm;
        }

        return nthTerm;
    }
}
