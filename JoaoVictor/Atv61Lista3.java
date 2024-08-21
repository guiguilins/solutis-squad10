package JoaoVictor;
import java.util.Scanner;

public class Atv61Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int qtdLinhas = scanner.nextInt();

        constroiPiramideAste(qtdLinhas);

        scanner.close();
    }

    public static void constroiPiramideAste(int qtdLinhas){
        for (int i = 1; i <= qtdLinhas; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha += "*";
            }
            System.out.print(linha + "\n");
        }
    }

}