package br.com.bandtec.exercicios.ex07.aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoPos extends Aluno {
    
    // atributos
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    // construtor
    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    // metodos
    @Override
    public Double calculaMedia() {
        Double soma = Util.sum(getNotas());
        Double media = soma / 3;
        return Util.arredondaValor(media, 2);
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Aluno", "AlunoPos");
        StringBuilder str = new StringBuilder(superStr);

        str.append(String.format("\nnota 1: %.2f", nota1));
        str.append(String.format("\nnota 2: %.2f", nota2));
        str.append(String.format("\nmonografia: %.2f", notaMonografia));

        return String.valueOf(str);
    }

    private List<Double> getNotas() {
        List<Double> notas = new ArrayList<>();
        notas.add(this.nota1);
        notas.add(this.nota2);
        notas.add(this.notaMonografia);
        return notas;
    }

    // getters e setters
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
    public Double getNotaMonografia() {
        return notaMonografia;
    }
    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
}
