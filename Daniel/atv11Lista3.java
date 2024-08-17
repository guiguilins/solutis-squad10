package Daniel;

import java.util.Scanner;

public class atv11Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar ainda.");
        } else if (idade <= 16 || idade >= 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        sc.close();
    }
}
