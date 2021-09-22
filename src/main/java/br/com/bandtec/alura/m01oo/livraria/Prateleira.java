package br.com.bandtec.alura.m01oo.livraria;

import java.util.Arrays;

public class Prateleira {

    // attributes
    private Integer qtdLivros = 0;
    private Livro[] livros = new Livro[0];

    // add book to book array
    public void addLivro(Livro livro) {
        this.livros = Arrays.copyOf(this.livros, this.livros.length + 1);
        this.livros[this.livros.length - 1] = livro;
        this.qtdLivros++;
    }

    // show all books
    @Deprecated
    public void exibeLivros() {
        for (int i = 0; i < this.qtdLivros; i++) {
            System.out.println(this.livros[i]);
        }
    }

    // get all books
    public Livro[] getLivros() {
        return this.livros;
    }

    // get a book by the index
    public Livro getLivro(int index) {
        return this.livros[index];
    }
}
