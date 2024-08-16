package samuel_31_to_40;

import java.util.Scanner;

public class Atividade_38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean primo = true;
		System.out.print("Digite um número pra verificar se é primo: ");
		int a = sc.nextInt();
		sc.close();
		
		if(a <= 1) {
			System.out.println("Número não é primo");
			return;
		}
		
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				primo = false;
				break;
			}
		}

		System.out.println(a + (primo ? " é primo" : " não é primo"));
	}
}
