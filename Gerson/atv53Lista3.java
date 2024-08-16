package Gerson;

import java.util.Scanner;

public class atv53Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero que você deseja ver a tabuada: ");
        int nTabuada = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nTabuada+ " x "+ i + " = "+ (i*nTabuada));
        }
    }
}
