package samuel_31_to_40;

import java.util.Scanner;

public class Atividade_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de pessoas no grupo: ");
		int qtd_pessoas = sc.nextInt();
		int somaIdades = 0;
		int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;
		int maioresDeIdade = 0;

		for (int i = 0; i < qtd_pessoas; i++) {
			System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
			int idade = sc.nextInt();
			somaIdades += idade;
			maiorIdade = Math.max(maiorIdade, idade);
			menorIdade = Math.min(menorIdade, idade);
			if (idade >= 18) maioresDeIdade++;
		}
		
		System.out.printf("\nA Média das idades: %.2f%n", (double) somaIdades / qtd_pessoas);
		System.out.println("A Maior idade: " + maiorIdade);
		System.out.println("A Menor idade: " + menorIdade);
		System.out.println("Quantidade de pessoas maiores de idade: " + maioresDeIdade);

		sc.close();

	}
}
