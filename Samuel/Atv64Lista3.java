package atividade_tres.atividade_complementar;

import java.util.Scanner;

public class Atv64Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Piramide de Asteriscos, digite a quantidade de triangulos: ");
		int a = sc.nextInt();
		sc.close();

		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
