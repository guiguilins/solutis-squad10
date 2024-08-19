package Guilherme;

import java.util.Scanner;

public class Atv1Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.print("Qual o seu ano atual: ");
        int anoAtual = sc.nextInt();

        int idadeUsuario = anoAtual - ano;
        System.out.println("Idade: " + idadeUsuario);

    }

}
