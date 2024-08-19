package Daniel;

import java.util.Scanner;
/*
    Exercício anterior implementado com informação do semestre
*/
public class Atv16Lista3 {
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
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 2:
                if (dia <= 29 && dia > 0) {
                    System.out.println("Data OK. Mês: Fevereiro");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 3:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Março");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 4:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Abril");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 5:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Maio");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 6:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Junho");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 7:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Julho");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 8:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Agosto");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;   
            case 9:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Setembro");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            case 10:
                if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Outubro");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;              
            case 11:
                if (dia <= 30 && dia > 0) {
                    System.out.println("Data OK. Mês: Novembro");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
            break;  
            case 12:
            if (dia <= 31 && dia > 0) {
                    System.out.println("Data OK. Mês: Dezembro");
                    trimestre(mes);
                } else {
                    System.out.println("Data inválida");
                }
                break;
            default:
                System.out.println("Mês inválido.");
        }

        sc.close();
    }

    public static void trimestre(int mes) {
        if (mes > 0 && mes <= 3) {
            System.out.println("1º Trimestre");
        } else if (mes > 3 && mes <= 6) {
            System.out.println("2º Trimestre");
        } else if (mes > 6 && mes <= 9) {
            System.out.println("3º Trimestre");
        } else if (mes > 9 && mes <= 12) {
            System.out.println("4º Trimestre");
        }
    }
}