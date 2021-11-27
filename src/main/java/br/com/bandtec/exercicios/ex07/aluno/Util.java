package br.com.bandtec.exercicios.ex07.aluno;

import java.util.List;

public class Util {

    // return the sum of the double list
    public static Double sum(List<Double> notas) {
        Double total = 0d;

        for(Double nota : notas) {
            total += nota;
        }

        return total;
    }

    // arredonda valor para 
    public static Double arredondaValor(Double valor, Integer casasDecimais) {
        Double fatorDivisao = Math.pow(10, casasDecimais);
        return Double.valueOf(Math.round(valor * fatorDivisao)) / fatorDivisao;
    }
}
