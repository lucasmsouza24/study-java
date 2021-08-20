package br.com.bandtec.aula03;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        for (Integer i = 0; i >= -10; i--) {
            System.out.println("For: " + i);
        }
        
        Integer i = 0;
        
        while(i <= 100) {
            System.out.println("While: " + i);
            i++;
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a resposta pra vida: ");
        Integer resposta = sc.nextInt();
        
        while(resposta != 42) {
            System.out.println("Resposta errada: ");
            System.out.println("Digite novamente: ");
            resposta = sc.nextInt();
        }
        
        System.out.println("Digite um nome foda: ");
        String nome = sc.nextLine();
        
        do {
            System.out.println("Digite novamente: ");
            nome = sc.nextLine();
        } while (!nome.equals("pedrolas"));
    }
}
