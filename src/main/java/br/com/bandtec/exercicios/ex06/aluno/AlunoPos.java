package br.com.bandtec.exercicios.ex06.aluno;

public class AlunoPos extends Aluno {
    // attribute
    private Double notaMonografia;

    // constructor
    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    // methods
    @Override
    public Double calculaMedia() {
        return (this.notaMonografia + this.notaContinuada + this.notaSemestral) / 3;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", ", notaMonografia=" + this.notaMonografia) + "]";
    }

    // getters and setters 
    public Double notaMonografia() {
        return this.notaMonografia;
    }
    public void notaMonografia(Double nota) {
        this.notaMonografia = nota;
    }
}
