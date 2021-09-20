package br.com.bandtec.alura.m01oo.livraria;

import java.util.Scanner;

public class Menu {
    
    private String str = "-".repeat(30) + 
    "\n[1] adicionar livro" + 
    "\n[2] ver livros";

    private Scanner sc = new Scanner(System.in);
    private Scanner scd = new Scanner(System.in);
    
    public void exibirMenu() {
        System.out.println(str);
    }

    public void addLivro(Prateleira p) {
        System.out.println("Nome do livro: ");
        String nome = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        System.out.println("Valor");
        Double valor = scd.nextDouble();

        Livro livro = new Livro(nome, autor, valor);
        p.addLivro(livro);
    }
}
