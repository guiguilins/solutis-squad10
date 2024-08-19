package Karen;

import java.util.Scanner;

public class Atv29Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do vértice superior esquerdo (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Digite as coordenadas do vértice inferior direito (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("As coordenadas formam um ponto.");
        } else if (x1 == x2) {
            System.out.println("As coordenadas formam uma reta vertical.");
        } else if (y1 == y2) {
            System.out.println("As coordenadas formam uma reta horizontal.");
        } else {
            System.out.println("As coordenadas formam um retângulo.");
        
            int largura, altura;

            if (x1 > x2) largura = x1 - x2;
             else largura = x2 - x1;            

            if (y1 > y2) altura = y1 - y2;
             else altura = y2 - y1;             
                        
            int area = largura * altura;
            System.out.println("A área do retângulo é: " + area);

            System.out.print("Digite as coordenadas do ponto a ser verificado (x, y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < x1 && y > y1) {
                System.out.println("O ponto está acima e à esquerda do retângulo.");
            } else if (x > x2 && y > y1) {
                System.out.println("O ponto está acima e à direita do retângulo.");
            } else if (x < x1 && y < y2) {
                System.out.println("O ponto está embaixo e à esquerda do retângulo.");
            } else if (x > x2 && y < y2) {
                System.out.println("O ponto está embaixo e à direita do retângulo.");
            } else if (x < x1) {
                System.out.println("O ponto está à esquerda do retângulo.");
            } else if (x > x2) {
                System.out.println("O ponto está à direita do retângulo.");
            } else if (y > y1) {
                System.out.println("O ponto está acima do retângulo.");
            } else if (y < y2) {
                System.out.println("O ponto está embaixo do retângulo.");
            } else if (x >= x1 && x <= x2 && y >= y2 && y <= y1) {
                System.out.println("O ponto está dentro do retângulo.");
            } else {
                System.out.println("O ponto está na linha do retângulo.");
            }
        }

        scanner.close();
    }
}

