package Gerson;

import java.util.Scanner;

public class Atv62Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (i>9){
                    System.out.printf(i+" ");
                }
                else {
                    System.out.printf("0"+i+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
