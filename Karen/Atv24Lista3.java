package Karen;

import java.util.Scanner;

public class Atv24Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) 
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) {
                        dataValida = true;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        dataValida = true;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
                if (dia >= 1 && dia <= 30) {
                    dataValida = true;
                }
            } else { 
                if (dia >= 1 && dia <= 31) {
                    dataValida = true;
                }
            }
        

        if (dataValida) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }

        scanner.close();
    }
}
