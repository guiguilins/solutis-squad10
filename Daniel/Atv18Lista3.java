package Daniel;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
/*
    Exercício anterior implementado com informação do ano e idade
*/
public class Atv18Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do mês:");
        int mes = sc.nextInt();

        System.out.println("Digite o dia do mês:");
        int dia = sc.nextInt();
 
        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        System.out.println("Digite o número do mês atual:");
        int mesAtual = sc.nextInt();

        System.out.println("Digite o dia do mês atual:");
        int diaAtual = sc.nextInt();

        System.out.println("Digite o ano atual:");
        int anoAtual = sc.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Janeiro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 2:
                if (dia <= 29 && dia > 0) {
                    System.out.println("\nData OK. Mês: Fevereiro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 3:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Março");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 4:
                if (dia <= 30 && dia > 0) {
                    System.out.println("\nData OK. Mês: Abril");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 5:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Maio");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 6:
                if (dia <= 30 && dia > 0) {
                    System.out.println("\nData OK. Mês: Junho");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 7:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Julho");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 8:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Agosto");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;   
            case 9:
                if (dia <= 30 && dia > 0) {
                    System.out.println("\nData OK. Mês: Setembro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            case 10:
                if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Outubro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;              
            case 11:
                if (dia <= 30 && dia > 0) {
                    System.out.println("\nData OK. Mês: Novembro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
            break;  
            case 12:
            if (dia <= 31 && dia > 0) {
                    System.out.println("\nData OK. Mês: Dezembro");
                    trimestre(mes);
                    horoscopo(dia, mes);
                } else {
                    System.out.println("\nData inválida");
                }
                break;
            default:
                System.out.println("\nMês inválido.");
        }

        calcularIdade(dia, mes, ano, diaAtual, mesAtual, anoAtual);
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

    public static void horoscopo(int dia, int mes) {
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Signo: Aquário");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Signo: Peixes");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Signo: Áries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Signo: Touro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Signo: Gêmeos");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Signo: Câncer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Signo: Leão");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Signo: Virgem");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Signo: Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Signo: Escorpião");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Signo: Sagitário");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Signo: Capricórnio");
        }
    }

    public static void calcularIdade(int diaNascimento, int mesNascimento, int anoNascimento, int diaAtual, int mesAtual, int anoAtual) {
        if ((mesNascimento <= 12 && mesNascimento > 0) && (mesAtual <= 12 && mesAtual > 0)) {
            if ((diaNascimento <= 31 && diaNascimento > 0) && (diaAtual <= 31 && diaNascimento > 0)) {
                LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
                LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
                Period idade = Period.between(dataNascimento, dataAtual);

                if (dataNascimento.isAfter(dataAtual)) {
                    System.out.println("Data de nascimento inválida.");
                    return;
                }

                System.out.println("Idade: " + idade.getYears() + " ano(s)");
            } 
        }
    }
}