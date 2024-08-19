package Gerson;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

    /*

    54. Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente
    configurável, ou seja o usuário pode informar o valor inicial e final, o valor de incremento e o
    valor de 1 dólar. Apresente os números no formato monetário com duas casas decimais.

     */

public class Atv54Lista3 {
    public static void main(String[] args) {
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor inicial em reais: ");
        double valorInicial = sc.nextDouble();
        System.out.print("Informe o valor final em reais: ");
        double valorFinal = sc.nextDouble();
        System.out.print("Informe o valor de incremento em reais: ");
        double incremento = sc.nextDouble();
        System.out.print("Informe o valor de 1 dólar em reais: ");
        double valorDolar = sc.nextDouble();

        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("--------------------------------------------");

        for (double valorAtual = valorInicial; valorAtual <= valorFinal; valorAtual += incremento) {
            double valorConvertido = valorAtual / valorDolar;
            System.out.println(formatoReal.format(valorAtual) + " = " + formatoDolar.format(valorConvertido));
            if (valorAtual + incremento > valorFinal) {
                System.out.println("Sobrou um total de: " + formatoReal.format(valorFinal - valorAtual) +
                        " que convertido em dolar fica: " + formatoDolar.format((valorFinal - valorAtual) / valorDolar));
            }
        }
        sc.close();
    }
}
