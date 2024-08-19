package Karen;

import java.util.Scanner;

public class Atv23Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = scanner.nextLine();
        System.out.print("Dia de nascimento: ");
        int dia1 = scanner.nextInt();
        System.out.print("Mês de nascimento: ");
        int mes1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = scanner.nextLine();
        System.out.print("Dia de nascimento: ");
        int dia2 = scanner.nextInt();
        System.out.print("Mês de nascimento: ");
        int mes2 = scanner.nextInt();


        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println("O primeiro aniversariante é: " + nome1);
        } else if (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2)) {
            System.out.println("O primeiro aniversariante é: " + nome2);
        } else {
            System.out.println("As duas pessoas fazem aniversário na mesma data.");
        }

        scanner.close();
    }
}
