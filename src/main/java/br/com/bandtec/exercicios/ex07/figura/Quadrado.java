package br.com.bandtec.exercicios.ex07.figura;

public class Quadrado extends Figura {
    // atributos
    private Double lado;

    // construtor
    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    // métodos
    @Override
    public Double calculaArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Figura", "Quadrado");

        StringBuilder str = new StringBuilder(superStr);

        str.append(String.format("\nlado     : %.1f", this.lado));

        return String.valueOf(str);
    }

    // getters e setters
    public Double getLado() {
        return lado;
    }
    public void setLado(Double lado) {
        this.lado = lado;
    }
}
