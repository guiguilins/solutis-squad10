package Daniel;

import java.util.Scanner;

public class Atv15Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do mês:");
        int mes = sc.nextInt();

        System.out.println("Digite o dia do mês:");
        int dia = sc.nextInt();
 
        switch (mes) {
            case 1:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Janeiro");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 2:
                if (dia <= 29) {
                System.out.println("Data OK. Mês: Fevereiro");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 3:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Março");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 4:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Abril");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 5:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Maio");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 6:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Junho");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 7:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Julho");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 8:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Agosto");
                } else {
                    System.out.println("Data inválida");
                }
                break;   
            case 9:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Setembro");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 10:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Outubro");
                } else {
                    System.out.println("Data inválida");
                }
                break;              
            case 11:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Novembro");
                } else {
                    System.out.println("Data inválida");
                }
            break;  
            case 12:
            if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Dezembro");
                } else {
                    System.out.println("Data inválida");
                }
                break;
            default:
                System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
