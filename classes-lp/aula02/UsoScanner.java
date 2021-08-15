package br.com.bandtec.mavenproject1.nivelamento;
import java.util.Scanner;

public class UsoScanner {
    
    public static void main(String[] args) {
        // Scanner instance
        Scanner sc = new Scanner(System.in);
        
        // nome
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        // idade
        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();
        
        // closing Scanner object
        sc.close();
        
        // display
        String msg = String.format("Nome: %s\nIdade: %d", nome, idade);
        System.out.println(msg);
    }
}
