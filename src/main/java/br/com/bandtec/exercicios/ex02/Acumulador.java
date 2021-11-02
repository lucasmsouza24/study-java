package br.com.bandtec.exercicios.ex02;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
        // Instancia do scanner
        Scanner sc = new Scanner(System.in);
        
        // acumuladores
        Integer input;
        Integer soma = 0;
        
        // Iteração de inputs
        do {
            System.out.println("Digite um inteiro (0 para parar)");
            input = sc.nextInt();
            soma += input;
        } while (input != 0);

        sc.close();
        
        System.out.println("Soma: " + soma);
        
    }
    
}
