package br.com.bandtec.ex02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer inputInt;
        
        // input
        do {
            System.out.println("Digite um número de 1 a 100:");
            inputInt = sc.nextInt();
        } while(inputInt < 0 || inputInt > 100);

        sc.close();

        // Variáveis acumulativas
        Integer indexPrimeiroSorteio = null;
        Integer par = 0;
        Integer impar = 0;
        
        // Iteração de sorteios
        System.out.println("=".repeat(30));
        for (Integer i = 0; i <= 200; i++) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(0, 200);

            if (sorteio % 2 == 0) {
                // Verificando se a posição do sorteio é par
                par++;
            } else {
                // Verificando se a posição do sorteio é ímpar
                impar++;
            }

            // verificando sucesso do sorteio
            if (sorteio == inputInt) {
                if (indexPrimeiroSorteio == null) {
                    // Verificando se é o primeiro sorteio de sucesso
                    indexPrimeiroSorteio = i;
                } 

                System.out.println(i + ": " + sorteio);
            }
        }
        System.out.println("=".repeat(30));
        
        // Exibição de valores
        if (indexPrimeiroSorteio != null) {
            System.out.println("Primeiro acerto na " + indexPrimeiroSorteio + "º tentativa.");
        } else {
            System.out.println("Não foi dessa vez. Sem acertos =(");
        }
        System.out.println("\nQtd de pares sorteados: " + par);
        System.out.println("\nQtd de impares sorteados: " + impar);
    }
    
}
