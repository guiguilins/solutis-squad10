package Gerson;

    /*

    55. A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite
    100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
    para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma
    promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor
    do minuto excedente para outras operadoras é de 0.65(Acredito que o valor serve para
    numero fixo também), e para a própria Vai-Vai é 0.20.
    Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
    operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada
    entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
    enquanto ele indicar que existem mais ligações a serem digitadas.

     */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Cliente {
    public static int minutosQualquerOperadora = 100;
    public static int minutosOperadoraVaiVai = 50;

    public static double valorExcedente;

    static NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public static void EscolheMetodo(String s, int minutos) {
        switch (s) {
            case "v":
                ligarVaiVai(minutos);
                break;
            case "f":
                ligarFixo(minutos);
                break;
            case "o":
                ligarOutrasOperadoras(minutos);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }


    private static void ligarOutrasOperadoras(int minutos) {
        if (minutos > minutosQualquerOperadora) {
            double valorCobradoExcedente = (minutos - minutosQualquerOperadora) * 0.65;
            Cliente.valorExcedente += valorCobradoExcedente;
            minutosQualquerOperadora -= minutos;
            System.out.println("Apos a ligação você possui: " + 0 + " minutos disponiveis " + "\nE será cobrado: " + formatoReal.format(valorCobradoExcedente) + " pelos os minutos a mais gastos");
        } else {
            minutosQualquerOperadora -= minutos;
            System.out.println("Restam :" + minutosQualquerOperadora + " minutos, para ligar para qualquer operadora" +
                    "E você possui um bonus de: " + minutosOperadoraVaiVai + " para ligar para numeros da operadora VaiVai");
        }
    }

    private static void ligarFixo(int minutos) {
        int valor = minutos / 2;
        if (valor > minutosQualquerOperadora) {
            //Pequena observação como os minutos para fixo são divididos por 2, então se por acaso exceda 50min
            // o valor excedente sera cobrado sobre 25min. (não sei se ta correto to apenas seguindo a logica da
            // questão, que fala que numero fixos consomem metade dos minutos)
            double valorCobradoExcedente = (valor - minutosQualquerOperadora) * 0.65;
            Cliente.valorExcedente += valorCobradoExcedente;
            minutosQualquerOperadora -= valor;
            System.out.println("Apos a ligação você possui: " + 0 + " minutos disponiveis " + "\nE será cobrado: " + formatoReal.format(valorCobradoExcedente) + " pelos os minutos a mais gastos");
        } else {
            minutosQualquerOperadora -= valor;
            System.out.println("Restam :" + minutosQualquerOperadora + " minutos, para ligar para qualquer operadora" +
                    "E você possui um bonus de: " + minutosOperadoraVaiVai + "para ligar para numeros da operadora VaiVai");
        }
    }

    private static void ligarVaiVai(int minutos) {
        int valorRestante = minutosOperadoraVaiVai - minutos;
        minutosOperadoraVaiVai -= minutos;
        if (valorRestante > 0) {
            System.out.println("Restam :" + minutosQualquerOperadora + " minutos, para ligar para qualquer operadora." +
                    " E você possui um bonus de: " + minutosOperadoraVaiVai + " minutos, para ligar para numeros da operadora VaiVai");
        }
        minutosQualquerOperadora += valorRestante;
        if (0 < minutosQualquerOperadora) {
            minutosOperadoraVaiVai = 0;
            System.out.println("Restam :" + minutosQualquerOperadora + " minutos, para ligar para qualquer operadora." +
                    " E você possui um bonus de: " + minutosOperadoraVaiVai + " minutos, para ligar para numeros da operadora VaiVai");
        } else {
            double valorCobradoExcedente = Math.multiplyExact(-1, minutosQualquerOperadora) * 0.20;
            Cliente.valorExcedente += valorCobradoExcedente;
            minutosOperadoraVaiVai -= valorRestante;
            System.out.println("Apos a ligação você possui: " + 0 + " minutos disponiveis " + "\nE será cobrado: " + formatoReal.format(valorCobradoExcedente) + " pelos os minutos a mais gastos");

        }
    }

}

public class Atv55Lista3 {
    public static void main(String[] args) {
        int continuar = 1;
        Scanner sc = new Scanner(System.in);
        do {
            String tipoOperadora = sc.next();
            int minutos = sc.nextInt();
            Cliente.EscolheMetodo(tipoOperadora, minutos);

            System.out.println("Deseja fazer outra ligação? digite 1 caso contrario digite qualquer numero.");
            continuar = sc.nextInt();

        } while (continuar == 1);
        sc.close();
    }
}
