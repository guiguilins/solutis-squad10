package Gerson;

import java.util.Scanner;

public class Atv63Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j>9){
                    System.out.printf(j+" ");
                }
                else {
                    System.out.printf("0"+j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
