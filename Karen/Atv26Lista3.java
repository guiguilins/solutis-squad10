package Karen;

import java.util.Scanner;

public class Atv26Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora do primeiro horário: ");
        int hora1 = scanner.nextInt();
        System.out.println("Digite os minutos do primeiro horário: ");
        int minutos1 = scanner.nextInt();

        int segundosTotais1 = (hora1 * 3600) + (minutos1 * 60);

        System.out.println("Digite a hora do segundo horário: ");
        int hora2 = scanner.nextInt();
        System.out.println("Digite os minutos do segundo horário: ");
        int minutos2 = scanner.nextInt();

        int segundosTotais2 = (hora2 * 3600) + (minutos2 * 60);

        int diferencaSegundos;
        
        if(segundosTotais1 > segundosTotais2){
            diferencaSegundos = segundosTotais1 - segundosTotais2;
        } else {
            diferencaSegundos = segundosTotais2 - segundosTotais1;
        }
        
        System.out.println("A diferença entre os horários é de " + diferencaSegundos + " segundos.");


    }
}
