package atividade_tres.atividade_complementar;

import java.util.Scanner;

public class Atv63Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Piramide de Asteriscos, digite a quantidade de linhas: ");
		int a = sc.nextInt();
		sc.close();
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(String.format("%02d", j));
			}
			System.out.println("");
		}
	}
}
