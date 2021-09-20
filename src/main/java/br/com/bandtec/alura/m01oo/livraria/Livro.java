package br.com.bandtec.alura.m01oo.livraria;

public class Livro {
    
    // attributes
    public String titulo;
    String nomeAutor;
    private Double valor;

    // constructor
    Livro(String titulo, String nomeAutor, Double valor) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.valor = valor > 0 ? valor : 0d;
    }

    // getters

    // to string override
    @Override
    public String toString() {
        String str = "-".repeat(30) +
        "\n%s" +
        "\n%s" + 
        "\nR$ %.2f\n" +
        "-".repeat(30);
        return String.format(str, this.titulo, this.nomeAutor, this.valor);
    }

}
