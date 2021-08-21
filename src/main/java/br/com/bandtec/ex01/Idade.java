package br.com.bandtec.ex01;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {

        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + "! Qual o ano do seu nascimento?");
        Integer ano_nascimento = sc.nextInt();

        // Fechando Scanner
        sc.close();

        // calculando idade em 2030
        Integer idade = 2030 - ano_nascimento;

        // Exibindo resultado
        String msg = "Em 2030 você terá %d anos.";
        msg = String.format(msg, idade);
        System.out.println(msg);
    }
}
