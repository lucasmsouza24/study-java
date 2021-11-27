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
        return "Aluno [nome=" + nome + ", ra=" + ra + ", media=" + this.calculaMedia()+ "]";
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
