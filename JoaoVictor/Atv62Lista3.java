package JoaoVictor;
import java.util.Scanner;

public class Atv62Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int qtdLinhas = scanner.nextInt();

        constroiPiramideRep(qtdLinhas);

        scanner.close();
    }

    public static void constroiPiramideRep(int qtdLinhas){
        int[][] piramide = new int[qtdLinhas][];

        for (int i = 0; i < qtdLinhas; i++) {
            piramide[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                piramide[i][j] = i + 1;
                System.out.printf("%02d ", piramide[i][j]);
            }
            System.out.println();
        }
    }

}