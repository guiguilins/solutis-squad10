package JoaoVictor;
import java.util.Scanner;

public class Atv64Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de triângulos: ");
        int qtdTri = scanner.nextInt();

        constroiTriangulos(qtdTri);

        scanner.close();
    }

    public static void constroiTriangulos(int qtdTriangulos){
        for (int t = 1; t <= qtdTriangulos; t++) {
            for (int i = 1; i <= t; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
