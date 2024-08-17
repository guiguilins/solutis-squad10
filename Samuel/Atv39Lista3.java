package samuel_31_to_40;

import java.util.Scanner;

public class Atv39Lista3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número pra verificar se é divisivel pela soma dos seus divisores: ");
		int a = sc.nextInt();
		sc.close();
		
		int sumdiv = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumdiv += i;
            }
        }
        if(sumdiv == a) {
        	System.out.println(a + " é um número perfeito.");
        } else {
        	System.out.println(a + " não é um número perfeito.");
        }
	}
}
