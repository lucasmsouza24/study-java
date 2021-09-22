package br.com.bandtec.alura.m01oo.livraria;

import java.util.Scanner;

public class Menu {

    // instances
    private Scanner sc = new Scanner(System.in);
    private Scanner scd = new Scanner(System.in);
    private Scanner sci = new Scanner(System.in);

    // menu text
    private String menuString = "-".repeat(30) + 
    "\n[1] Adicionar livro" + 
    "\n[2] Ver livros" +
    "\n[3] Sair";
    
    public void exibirMenu(Prateleira p) {

        // show menu and waiting to answer input
        System.out.println(this.menuString);
        String answer = sci.nextLine();

        // answer cases
        switch (answer) {
            case "1":
                // add book
                addLivro(p);
                break;
            case "2":
                // show all books
                this.exibirLivros(p);
                break;
            case "3":
                // the end of program
                System.out.println("Bye");
                break;
            default:
                // infinite case (invalid input)
                System.out.println("Valor inválido");
                exibirMenu(p);
                break;
        }
    }

    public void addLivro(Prateleira p) {
        // book data input
        System.out.println("Nome do livro: ");
        String nome = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        System.out.println("Valor");
        Double valor = scd.nextDouble();

        // create book instance
        Livro livro = new Livro(nome, autor, valor);

        // add book instance to Prateleira
        p.addLivro(livro);

        // returning to menu
        this.exibirMenu(p);
    }

    public void exibirLivros(Prateleira p) {

        // show all books
        for (Livro livro : p.getLivros()) {
            String str = "=".repeat(30) +
            "\nTítulo: %s" +
            "\nAutor: %s" +
            "\nPreço: R$ %.2f\n";
            str = String.format(str, livro.getTitulo(), livro.getNomeAutor(), livro.getValor());
            System.out.println(str);
        }

        this.exibirMenu(p);
    }
}
