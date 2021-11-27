package br.com.bandtec.exercicios.ex07.aluno;

public class AlunoFundamental extends Aluno {
    
    // attributes
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    // constructor
    public AlunoFundamental(String nome, Integer ra, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // methods

    @Override
    public Double calculaMedia() {
        Double somaNotas = nota1 + nota2 + nota3 + nota4;
        Double media = somaNotas / 4;

        double notasArredondadas = Double.valueOf(Math.round(media * 100)) / 100;
        return notasArredondadas;
    }
    
    // getters and setters

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }
}
