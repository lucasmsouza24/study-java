package br.com.bandtec.ex03;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
        // Instancia do scanner
        Scanner sc = new Scanner(System.in);
        
        // primeiro input
        System.out.println("Digite um inteiro (0 para parar)");
        Integer input = sc.nextInt();
        Integer soma = input;
        
        // Iteração de inputs
        while (input != 0) {
            System.out.println("Digite um inteiro (0 para parar)");
            input = sc.nextInt();
            soma += input;
        }
        
        System.out.println("Soma: " + soma);
        
    }
    
}
