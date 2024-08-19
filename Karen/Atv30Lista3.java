package Karen;

import java.util.Scanner;

public class Atv30Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas dos vértices do primeiro retângulo:");
        int[] retangulo1 = new int[8];
        for (int i = 0; i < 8; i++) {
            retangulo1[i] = scanner.nextInt();
        }

        System.out.println("Digite as coordenadas dos vértices do segundo retângulo:");
        int[] retangulo2 = new int[8];
        for (int i = 0; i < 8; i++) {
            retangulo2[i] = scanner.nextInt();
        }

        if (!ehRetangulo(retangulo1) || !ehRetangulo(retangulo2)) {
            System.out.println("Não é triangulo.");
            scanner.close();
            return;
        }

        int[] retangulo1Ordenado = ordenarRetangulo(retangulo1);
        int[] retangulo2Ordenado = ordenarRetangulo(retangulo2);

        if (trianguloIntercepta(retangulo1Ordenado, retangulo2Ordenado)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }

        scanner.close();
    }

    private static boolean ehRetangulo(int[] retangulo) {
        for (int i = 0; i < retangulo.length; i += 2) {
            for (int j = i + 2; j < retangulo.length; j += 2) {
                if (retangulo[i] == retangulo[j] && retangulo[i + 1] == retangulo[j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] ordenarRetangulo(int[] retangulo) {
        int xMin = retangulo[0];
        int xMax = retangulo[0];
        int yMin = retangulo[1];
        int yMax = retangulo[1];

        for (int i = 2; i < retangulo.length; i += 2) {
            if (retangulo[i] < xMin) {
                xMin = retangulo[i];
            }
            if (retangulo[i] > xMax) {
                xMax = retangulo[i];
            }
        }

        for (int i = 3; i < retangulo.length; i += 2) {
            if (retangulo[i] < yMin) {
                yMin = retangulo[i];
            }
            if (retangulo[i] > yMax) {
                yMax = retangulo[i];
            }
        }

        return new int[]{xMin, yMin, xMax, yMax};
    }

    private static boolean trianguloIntercepta(int[] retangulo1, int[] retangulo2) {
        return !(retangulo1[2] < retangulo2[0] || retangulo1[0] > retangulo2[2] || retangulo1[3] < retangulo2[1] || retangulo1[1] > retangulo2[3]);
    }
}
