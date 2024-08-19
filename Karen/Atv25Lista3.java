package Karen;

import java.util.Scanner;

public class Atv25Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        boolean horarioValido = false;

        if (horas >= 0 && horas <= 23) { 
            if (minutos >= 0 && minutos <= 59) {
                if (segundos >= 0 && segundos <= 59) { 
                    horarioValido = true;
                }
            }
        }

        if (horarioValido) {
            System.out.println("O horário " + horas + ":" + minutos + ":" + segundos + " é válido.");
        } else {
            System.out.println("O horário " + horas + ":" + minutos + ":" + segundos + " é inválido.");
        }

        scanner.close();
    }
}
