package samuel_31_to_40;

import java.util.Random;

public class Atividade_34 {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i = 0; i <= 50; i++) {
			System.out.println(random.nextInt(100) + 1);
		}
	}
}
