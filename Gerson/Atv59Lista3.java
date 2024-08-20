package Gerson;


    //59. Exiba as 10 tabuadas (de 1 a 10).


public class Atv59Lista3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            System.out.printf("Tabuada do %d%n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d X %2d = %3d%n", i, j, (i * j));
            }
        }
    }
}
