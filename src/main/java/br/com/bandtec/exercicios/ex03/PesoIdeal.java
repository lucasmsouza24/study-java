package br.com.bandtec.exercicios.ex03;

public class PesoIdeal {
    
    static Double calculaPesoIdeal(String sexo, Double altura) {
        if (sexo.equals("M")) {
            return (72.7 * altura) - 58;
        } else {
            return (62.1 * altura) - 44.7; 
        }
    }
}
