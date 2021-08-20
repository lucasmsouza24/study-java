package br.com.bandtec.ex03;

import java.util.Scanner;

public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer inputBase;
        Integer inputExpoente;
        
        // input
        do {
            System.out.println("Base: ");
            inputBase = sc.nextInt();
            
            System.out.println("Expoente: ");
            inputExpoente = sc.nextInt();
        } while(inputBase < 0 && inputExpoente < 0);
        
        Integer pot = 1;
        
        // Calculando resultado
        for (Integer i = 1; i <= inputExpoente; i++) {
            pot *= inputBase;
            //System.out.println(i);
        }
        System.out.println(inputBase + "^" + inputExpoente + " = " + pot);
    }
    
}
