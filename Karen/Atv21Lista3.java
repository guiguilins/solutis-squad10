package Karen;
import java.util.Scanner;

public class Atv21Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        String cargo = scanner.next();

        double valorEmprestimo = 0;

        switch (cargo.toLowerCase()) {
            case "diretoria":
                valorEmprestimo = salario * 0.30;
                break;
            case "gerência":
                valorEmprestimo = salario * 0.25;
                break;
            case "operacional":
                valorEmprestimo = salario * 0.20;
                break;
            default:
                System.out.println("Cargo não existe.");
                System.exit(0);
        }

        System.out.println("O valor do empréstimo possível para o cargo " + cargo + " é: R$ " + valorEmprestimo);
        
        scanner.close();
    }
}