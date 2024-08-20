package JoaoVictor;
import java.util.Arrays;
import java.util.Random;

public class Atv42Lista3 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Lista de 40 grupos de números sorteados de 0 a 59 em ordem crescente:");

        for (int i = 1; i <= 40; i++) {
            int[] grupo = new int[3];

            for (int j = 0; j < 3; j++) {
                grupo[j] = random.nextInt(60);
            }
            Arrays.sort(grupo);

            System.out.printf("Grupo %d: %d, %d, %d\n", i, grupo[0], grupo[1], grupo[2]);
        }
    }
}


