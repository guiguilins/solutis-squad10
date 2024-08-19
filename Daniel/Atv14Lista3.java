package Daniel;

import java.util.Scanner;

public class Atv14Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de um mês:");
        String mes = sc.nextLine();
        
        switch (mes.toLowerCase()) {
            case "janeiro":
                System.out.println("01");
                break;
            case "fevereiro":
                System.out.println("02");
                break;
            case "março":
                System.out.println("03");
                break;
            case "abril":
                System.out.println("04");
                break;
            case "maio":
                System.out.println("05");
                break;
            case "junho":
                System.out.println("06");
                break;
            case "julho":
                System.out.println("07");
                break;
            case "agosto":
                System.out.println("08");
                break;    
            case "setembro":
                System.out.println("09");
                break; 
            case "outubro":
                System.out.println("10");
                break;                
            case "novembro":
                System.out.println("11");
                break;  
            case "dezembro":
                System.out.println("12");
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }
        
        sc.close();
    }
}
