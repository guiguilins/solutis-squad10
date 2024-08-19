package Guilherme;

import java.util.Scanner;

public class Atv9Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        if(idade > 18) {
            System.out.println("O usuario e maior de idade!");
        }
        else{
            System.out.println("O usuario e menor de idade!");
        }
    }
}
