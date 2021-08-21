package br.com.bandtec.ex03;

public class NumerosImpares {
    
    public static void main(String[] args) {
    
        for (Integer i = 0; i <= 90; i++) {
            if (i % 2 != 0) {
                System.out.println("Num: " + i);
            }
        }
    }
    
}
