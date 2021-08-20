package br.com.bandtec.ex03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100:");
        Integer inputInt = sc.nextInt();
        Integer indexPrimeiroSorteio = null;
        Integer par = 0;
        Integer impar = 0;
        
        for (Integer i = 0; i <= 200; i++) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(0, 200);
            if (sorteio == inputInt && indexPrimeiroSorteio == null) {
                indexPrimeiroSorteio = i;
                System.out.println(i + ": " + sorteio);
                
                if (sorteio % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        
        System.out.println("primeiro acerto na " + indexPrimeiroSorteio + " tentativa.");
    }
    
}
