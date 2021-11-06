package br.com.bandtec.exercicios.ex06.aluno;

public class Aluno {
    
    // attributes
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    // constructor
    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }
    public Aluno(Integer ra, String nome, Integer notaContinuada, Integer notaSemestral) {
        this(ra, nome, Double.valueOf(notaContinuada), Double.valueOf(notaSemestral));
    }
    public Aluno(Integer ra, String nome, Double notaContinuada, Integer notaSemestral) {
        this(ra, nome, notaContinuada, Double.valueOf(notaSemestral));
    }
    public Aluno(Integer ra, String nome, Integer notaContinuada, Double notaSemestral) {
        this(ra, nome, Double.valueOf(notaContinuada), notaSemestral);
    }

    // methods
    public Double calculaMedia() {
        return this.notaContinuada * 0.4 + this.notaSemestral * 0.6;
    }

    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", media=" + calculaMedia() + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + "]";
    }

    // getters and setters
    // ra
    public Integer getRa() {
        return this.ra;
    }
    public void setRa(Integer ra) {
        this.ra = ra;
    }

    // nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // notaContinuada
    public Double getNotaContinuada() {
        return this.notaContinuada;
    }
    public void setNotaContinuada(Double nota) {
        this.notaContinuada = nota;
    }

    // notaSemestral
    public Double getNotaSemestral() {
        return this.notaSemestral;
    }
    public void setNotaSemestral(Double nota) {
        this.notaSemestral = nota;
    }
}
