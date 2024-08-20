package Gerson;

import java.util.Scanner;

    /*

        60. Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a
    partir de janeiro de 2007. Solicite o valor da dívida, a taxa de correção e a quantidade de anos.
    Por exemplo, para uma dívida de R$ 100,00 ao longo de 2 anos e com uma taxa de correção de 1.8
    % ao mês:
    Anos Jan    Fev    Mar    Abr    Mai    Jun    Jul    Ago    Set    Out    Nov    Dez
    2007 100,00 101,80 103,63 105,50 107,40 109,33 111,30 113,30 115,34 117,42 119,53 121,68
    2008 123,87 126,10 128,37 130,68 133,03 135,43 137,87 140,35 142,87 145,45 148,06 150,73

     */

public class Atv60Lista3 {
    private static void exibirEvolucaoDivida(double valorInicial, double taxaCorrecao, int anos) {
        System.out.println("Ano\t    Jan\t    Fev\t    Mar\t    Abr\t    Mai\t    Jun\t    Jul\t    Ago\t    Set\t    Out\t    Nov\t    Dez");
        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.print(ano + "\t");
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("%.2f\t", valorInicial);
                valorInicial += valorInicial * taxaCorrecao;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial da dívida: R$ ");
        double valorDivida = scanner.nextDouble();
        System.out.print("Digite a taxa de correção mensal (em %): ");
        double taxaCorrecao = scanner.nextDouble() / 100;
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();
        exibirEvolucaoDivida(valorDivida, taxaCorrecao, anos);

        scanner.close();
    }

}