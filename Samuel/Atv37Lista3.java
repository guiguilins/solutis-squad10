package samuel_31_to_40;

import java.util.Scanner;

public class Atv37Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor para descobrir o fatorial: ");
		int a = sc.nextInt();
		sc.close();
		int b = 1;
		for(int i = a; i > 0; i--) {
			b *= i;
		}
		System.out.println("Fatorial de: " + a + "\nÉ: " + b);
	}
}
