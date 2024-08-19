package Gerson;

import java.util.Scanner;

/*
    SEQUENCIA DE TRIBONACCI
    A FORMULA É : Tn = Tn-1 + Tn-2 + Tn-3; onde T0 = 1; T1 = 1; T = 2;
    ENTÃO APARTI DISSO O CODIGO DE OBTER O SEGUINTE RESULTADO: 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149 ...
    OU SEJA ATE O ENÉSIMO NUMERO;
 */
public class Atv51Lista3 {
    public static void main(String[] args) {
        int t0 = 1;
        int t1 = 1;
        int t2 = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantas vezes você quer ver a sequencia de tribonacci: ");
        int enesimoNumero = sc.nextInt();
        for (int i = 0; i < enesimoNumero; i++) {
            System.out.println(t0 + " -> " + t1 + " -> " + t2);
            t0 += t1 + t2;
            t1 += t0 + t2;
            t2 += t0 + t1;
        }
        sc.close();
    }
}
