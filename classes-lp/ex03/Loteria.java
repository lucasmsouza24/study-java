package br.com.bandtec.ex03;

import java.util.Scanner;
import  java.util.concurrent.ThreadLocalRandom;


public class Loteria {
    
    public static void main(String[] args) {
        
        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);
        
        // Solicitação de input
        System.out.println("Digite  um número entre 0 e 10:");
        Integer input = sc.nextInt();
        Integer sorteio = -1;
        Integer i = 1;
        
        // tentativas da máquina sortear o valor do input
        while(sorteio != input) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Valor sorteado: " + sorteio);
            i++;
        }
        
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
