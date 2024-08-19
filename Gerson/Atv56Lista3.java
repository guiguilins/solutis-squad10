package Gerson;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

    /*

        56. Crie um programa para simular uma urna de votação para exatamente 3 candidatos. Logo
    no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco.
    Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de
    cada candidato. Apresente também a quantidade e o percentual dos votos em branco e
    quem foi o ganhador da eleição.

     */

class Urna{
    private static int contCandidato1;
    private static int contCandidato2;
    private static int contCandidato3;
    private static int contNulo;

    public static void ContaVotos(String voto){
        switch (voto){
            case "123":
                contCandidato1++;
                break;
            case "456":
                contCandidato2++;
                break;
            case "789":
                contCandidato3++;
                break;
            case "000":
                contNulo++;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    public static double CalculaParcial(int contCandidato){
        int totalVotos = contCandidato1 + contCandidato2 + contCandidato3 + contNulo;
        if (totalVotos == 0) {
            return 0.0;
        }
        return ((double) contCandidato / totalVotos) * 100;
    }


    public static void Resultado() {
        Map<String, Double> resultado = new HashMap<>();
        resultado.put("Candidato 1", CalculaParcial(contCandidato1));
        resultado.put("Candidato 2", CalculaParcial(contCandidato2));
        resultado.put("Candidato 3", CalculaParcial(contCandidato3));

        System.out.println(" --- RESULTADO ---");
        System.out.println("A votação teve um total de : " +(contCandidato1 + contCandidato2 + contCandidato3 + contNulo)+ " Votos" +
                "\n Na qual a distribuição de votos ficou assim: ");
        for (Map.Entry<String, Double> candidato : resultado.entrySet()) {
            String nomeCandidato = candidato.getKey();
            Double percentualCandidato = candidato.getValue();
            System.out.printf("Candidato: %s Obteve: %.2f%% dos Votos%n", nomeCandidato, percentualCandidato);
        }
        System.out.printf("E votos nulos somaram: %.2f%%", CalculaParcial(contNulo));
    }

}

//CRIEI UM ARQUIVO DE TESTE COM ENTRADAS PARA FACILITAR
//CASO QUEIRA TESTAR MANUALMENTE BASTA COMENTAR DO TRY ATÉ DEPOIS DO CATCH,
// E DEPOIS DESCOMENTAR O DO.
public class Atv56Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Urna urna = new Urna();
        int continuar = 1;
        String arquivoTeste = "Gerson/TesteAtv56Lista3.txt";
        System.out.println("Bem vindo a Urna escolha entre os candidatos:" +
                "\n Candidato 1 = 123 " +
                "\n Candidato 2 = 456 " +
                "\n Candidato 3 = 789 " +
                "\n Votar em branco = 000 " +
                "\n Encerrar votação = 111");
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoTeste))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("111")) {
                    break;
                } else {
                    urna.ContaVotos(linha);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        /*do {
            String votar = sc.nextLine();
            if (votar.equals("111")){
                continuar = 111;
            }else {
                urna.ContaVotos(votar);
            }
        }while (continuar!=111);
         */
        urna.Resultado();
        sc.close();
    }
}
