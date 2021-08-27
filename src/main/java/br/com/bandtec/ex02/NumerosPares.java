package br.com.bandtec.ex02;

public class NumerosPares {
    public static void main(String[] args) {
        
        Integer i = 0;
        
        while (i <= 40) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
            i++;
        }
        
    }
}
