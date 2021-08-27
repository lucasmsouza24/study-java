package br.com.bandtec.ex02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner sc = new Scanner(System.in);

        // Input de tabuada escolhida
        System.out.println("Digite um número inteiro: ");
        Integer num = sc.nextInt();

        // Iteração de exibição da tabuada
        System.out.println("\n\tTabuada do " + num + "\n");
        for (Integer i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + i * num);
        }

        // Fechando Scanner
        sc.close();
    }
}
