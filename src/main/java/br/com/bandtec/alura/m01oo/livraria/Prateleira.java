package br.com.bandtec.alura.m01oo.livraria;

import java.util.Arrays;

public class Prateleira {

    // attributes
    private Integer qtdLivros = 0;
    private Livro[] livros = new Livro[0];

    public void addLivro(Livro livro) {
        this.livros = Arrays.copyOf(this.livros, this.livros.length + 1);
        this.livros[this.livros.length - 1] = livro;
        this.qtdLivros++;
    }

    public void exibeLivros() {
        for (int i = 0; i < this.qtdLivros; i++) {
            System.out.println(this.livros[i]);
        }
    }
}
