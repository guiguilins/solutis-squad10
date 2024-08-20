package Gerson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

    /*

        57. Exiba todas as datas de um calendário que estão entre duas datas informadas pelo usuário
    (dia, mês e ano). Suponha que as duas datas informadas sejam válidas.

     */

public class Atv57Lista3 {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate LerData(Scanner sc, String prompt) {
        LocalDate data = null;
        while (data == null) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                data = LocalDate.parse(input, FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
        return data;
    }
    private static void ExibirDatasEntre(LocalDate dataInicio, LocalDate dataFim) {
        if (dataInicio.isAfter(dataFim)) {
            System.out.println("A primeira data deve ser anterior ou igual à segunda data.");
            return;
        }
        System.out.println("Datas entre " + dataInicio.format(FORMATTER) + " e " + dataFim.format(FORMATTER) + ":");
        LocalDate dataAtual = dataInicio;
        while (!dataAtual.isAfter(dataFim)) {
            System.out.println(dataAtual.format(FORMATTER));
            dataAtual = dataAtual.plusDays(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dataInicio = LerData(scanner, "Digite a primeira data (dd/MM/yyyy): ");
        LocalDate dataFim = LerData(scanner, "Digite a segunda data (dd/MM/yyyy): ");
        ExibirDatasEntre(dataInicio, dataFim);
        scanner.close();
    }

}
