package br.com.bandtec.ex02;

import java.util.Scanner;
import  java.util.concurrent.ThreadLocalRandom;


public class Loteria {
    
    public static void main(String[] args) {
        
        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);
        
        // Solicitação de input
        System.out.println("Digite  um número entre 0 e 10:");
        Integer input = sc.nextInt();
        sc.close();
        
        Integer sorteio;
        Integer i = 1;
        
        // tentativas da máquina sortear o valor do input
        do {
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Valor sorteado: " + sorteio);
            i++;
        } while(sorteio != input);
        
        System.out.println("=".repeat(40));
        
        // Exibição de resultados
        if (i <= 3) {
            System.out.println("Você é muito sortudo.");
        } else if (i <= 10) {
            System.out.println("Você é sortudo.");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar.");
        }
        
        System.out.println("Tentativas necessárias: " + i);
    }
    
}
