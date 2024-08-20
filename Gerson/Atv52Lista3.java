package Gerson;

import java.math.BigInteger;

 /*

     52. A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que
    pagar uma quantia muito grande em sacos de arroz. A aposta feita anteriormente era que
    se o súdito ganhasse o rei teria que pagar um grão de arroz colocado na primeira casa de
    um tabuleiro de xadrez. Na segunda casa teria que pagar o dobro, ou seja, dois grãos de
    arroz, e assim sucessivamente até a casa número 64. Exiba quantos grãos de arroz este
    súdito teria que ganhar, somando todas as 64 casas.
    Depois tente exibir a quantia de sacos de arroz?

  */

public class Atv52Lista3 {
    public static void main(String[] args) {
        BigInteger valorFinal = BigInteger.valueOf(1);
        System.out.println("Casa n: "+1+" Valor total: "+ valorFinal);
        for (int i = 2; i <= 64; i++) {
            valorFinal = valorFinal.multiply(BigInteger.valueOf(2));
            System.out.println("Casa n: "+i+" Valor total: "+ valorFinal);
        }
    }
}
