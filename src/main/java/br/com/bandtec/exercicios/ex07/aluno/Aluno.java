package br.com.bandtec.exercicios.ex07.aluno;

public abstract class Aluno {
    
    // atributtes
    protected String nome;
    protected Integer ra;

    // constructor
    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }

    // methods
    public abstract Double calculaMedia();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nAluno\n");

        str.append("-".repeat(30));
        str.append(String.format("\nnome  : %s", this.nome));
        str.append(String.format("\nra    : %d", this.ra));
        str.append(String.format("\nmedia : %s", this.calculaMedia()));

        return String.valueOf(str);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getRa() {
        return ra;
    }
    public void setRa(Integer ra) {
        this.ra = ra;
    }
}
