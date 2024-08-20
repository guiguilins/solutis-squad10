package atividade_tres.atividade_complementar;

import java.util.Scanner;

public class Atv65Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Piramide de Asteriscos, digite a quantidade de linhas da piramide: ");
		int a = sc.nextInt();
		sc.close();
		for(int i = 1; i <= a; i++) {
			for(int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
