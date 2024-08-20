package JoaoVictor;

public class Atv49Lista3 {
    public static void main(String[] args) {
        int n = 50;
        long[] fibonacciSequence = generateFibonacci(n);
        displayFibonacci(fibonacciSequence);
    }

    public static long[] generateFibonacci(int n) {
        long[] fibonacci = new long[n];

        if (n > 0) fibonacci[0] = 1;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void displayFibonacci(long[] fibonacci) {
        System.out.println("Os primeiros 50 números da sequência de Fibonacci são:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + (i < fibonacci.length - 1 ? ", " : "\n"));
        }
    }
}

