package JoaoVictor;
import java.util.Scanner;

public class Atv46Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 200;

        Pessoa[] pessoas = new Pessoa[quantidadePessoas];

        System.out.println("Por favor, insira os dados para 200 pessoas:");

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Pessoa " + (i + 1) + "\n");

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            pessoas[i] = new Pessoa(sexo, idade);
            System.out.print("____________________________________________\n");
        }

        int quantidadeHomensMaiores = contaMaioresDeIdade(pessoas, 'M');
        int quantidadeMulheresMaiores = contaMaioresDeIdade(pessoas, 'F');

        System.out.println("Total de homens maiores de idade: " + quantidadeHomensMaiores);
        System.out.println("Total de mulheres maiores de idade: " + quantidadeMulheresMaiores);
    }

    public static int contaMaioresDeIdade(Pessoa[] pessoas, char sexo) {
        int count = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == sexo && pessoa.getIdade() >= 18) {
                count++;
            }
        }

        return count;
    }
}

class Pessoa {
    private char sexo;
    private int idade;

    public Pessoa(char sexo, int idade) {
        this.sexo = sexo;
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}

