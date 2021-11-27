package br.com.bandtec.exercicios.ex07.aluno;

public class AlunoGraduacao extends Aluno {
    
    // attributes
    private Double nota1;
    private Double nota2;

    // constructor
    public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // methods

    @Override
    public Double calculaMedia() {
        Double media = this.nota1 * 0.4 + this.nota2 * 0.6;
        long mediaVezes100 = Math.round(media * 100);
        Double mediaArredondada = Double.valueOf(mediaVezes100) / 100;
        return mediaArredondada;
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

    @Override
    public String toString() {    
        return super.toString().replaceAll("Aluno", "AlunoGraduacao");
    }
}
