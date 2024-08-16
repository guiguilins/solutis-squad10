package samuel_31_to_40;

import java.util.Scanner;

public class Atividade_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número:");
		int a = sc.nextInt();
		System.out.print("Digite o segundo número:");
		int b = sc.nextInt();
		sc.close();
		
        for(int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
}
