package br.com.bandtec.exercicios.ex08;

public class SuperPoder {
    // atributos
    private String nome;
    private Integer categoria;

    // construtor
    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("\nSuperPoder\n");

        strBuilder.append("-".repeat(30));
        strBuilder.append(String.format("\nNome: %s", this.nome));
        strBuilder.append(String.format("\nCategoria: %d", this.categoria));

        return String.valueOf(strBuilder);
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCategoria() {
        return categoria;
    }
    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
