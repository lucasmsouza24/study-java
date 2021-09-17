package br.com.bandtec.aula04poo.exemplo01;

public class Aluno {

    // Attributes
    Integer ra;
    String nome;
    Double nota1;
    Double nota2;
    String situacao;

    // Methods
    // constructor
    public Aluno(Integer ra, String nome, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.situacao = this.getMedia() > 6 ? "aprovado" : "reprovado";
    }
    
    public Double getMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    @Override
    public String toString() {
        String str = "ra: %d\nnome: %s\nmedia: %.2f\nsituacao: %s\n";
        return String.format(str, this.ra, this.nome, this.getMedia(), this.situacao);
    }
}
