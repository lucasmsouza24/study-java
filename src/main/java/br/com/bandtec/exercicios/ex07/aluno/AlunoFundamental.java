package br.com.bandtec.exercicios.ex07.aluno;

import java.util.ArrayList;
import java.util.List;

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
        Double media = Util.sum(getNotas()) / 4;
        return Util.arredondaValor(media, 2);
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Aluno", "AlunoFundamental");
        
        StringBuilder str = new StringBuilder(superStr);

        str.append(String.format("\nnota 1: %.2f", nota1));
        str.append(String.format("\nnota 2: %.2f", nota2));
        str.append(String.format("\nnota 3: %.2f", nota3));
        str.append(String.format("\nnota 4: %.2f", nota4));

        return String.valueOf(str);
    }

    public List<Double> getNotas() {
        List<Double> notas = new ArrayList<>();

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);

        return notas;
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
