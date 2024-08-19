package Daniel;

import java.util.Scanner;

public class Atv20Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = sc.nextInt();

        if (idade1 > idade2) {
            System.out.println("Pessoa mais velha: " + nome1);
            System.out.println("Pessoa mais nova: " + nome2);
        } else if (idade1 < idade2) {
            System.out.println("Pessoa mais velha: " + nome2);
            System.out.println("Pessoa mais nova: " + nome1);
        } else {
            System.out.println("Ambas as pessoas têm a mesma idade.");
        }

        sc.close();
    }
}
