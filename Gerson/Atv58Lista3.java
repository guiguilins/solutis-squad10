package Gerson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

    /*

        58. Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela
    quantidade de dias fornecida. Exemplo: 29/04/2007 + 3 = 02/05/2007.

     */

public class Atv58Lista3 {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate LerData(Scanner scanner, String prompt) {
        LocalDate data = null;
        while (data == null) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                data = LocalDate.parse(input, FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
        return data;
    }
    private static int LerQuantidadeDias(Scanner scanner) {
        int quantidadeDias = -1;
        while (quantidadeDias < 0) {
            System.out.print("Digite a quantidade de dias a adicionar: ");
            String input = scanner.nextLine();
            try {
                quantidadeDias = Integer.parseInt(input);
                if (quantidadeDias < 0) {
                    System.out.println("A quantidade de dias deve ser um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        return quantidadeDias;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate data = LerData(scanner, "Digite a data (dd/MM/yyyy): ");
        int diasParaAdicionar = LerQuantidadeDias(scanner);
        LocalDate novaData = data.plusDays(diasParaAdicionar);
        System.out.println(data.format(FORMATTER) + " + " + diasParaAdicionar + " = " + novaData.format(FORMATTER));
        scanner.close();
    }
}
