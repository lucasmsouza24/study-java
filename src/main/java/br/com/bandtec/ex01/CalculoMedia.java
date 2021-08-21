package br.com.bandtec.avaliacao1;
import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);
        
        // Input de dados
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua 1º nota: ");
        Double nota1 = sc.nextDouble();

        System.out.println("Digite sua 2º nota: ");
        Double nota2 = sc.nextDouble();

        // fechando scanner
        sc.close();

        // Calculando média
        Double media = (nota1 + nota2) / 2;

        // Exibindo resultado
        String msg = "Nome: %s\nNota 1: %.1f\nNota 2: %.1f\nMédia: %.1f";
        msg = String.format(msg, nome, nota1, nota2, media);
        System.out.println(msg);
    }
}
