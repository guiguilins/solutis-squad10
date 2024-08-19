package samuel_31_to_40;

import java.util.Random;
import java.util.Scanner;

public class Atv35Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Determine uma quantidade de números a ser sorteada: ");
		int size = sc.nextInt();
		
		int faixa_min;
		int faixa_max;
		
		do {
			System.out.print("Determine o valor mínimo pra sorteio: ");
			faixa_min = sc.nextInt();
			System.out.println("Determine o valor máximo pra sorteio: ");
			faixa_max = sc.nextInt();
			if(faixa_max <= faixa_min) {
				System.out.println("O valor máximo deve ser maior que o mínimo");
			}
		} while(faixa_max <= faixa_min);
		
		sc.close();
		System.out.println("Valores sorteados: ");
		for(int i = 0; i < size; i++) {
			System.out.print((random.nextInt(faixa_max - faixa_min) + 1) + " ");
		}
		
	}
}
