package Gerson;

import java.math.BigInteger;

public class atv52Lista3 {
    public static void main(String[] args) {
        BigInteger valorFinal = BigInteger.valueOf(1);
        System.out.println("Casa n: "+1+" Valor total: "+ valorFinal);
        for (int i = 2; i <= 64; i++) {
            valorFinal = valorFinal.multiply(BigInteger.valueOf(2));
            System.out.println("Casa n: "+i+" Valor total: "+ valorFinal);
        }
    }
}
