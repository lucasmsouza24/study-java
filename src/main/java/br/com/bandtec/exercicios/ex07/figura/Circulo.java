package br.com.bandtec.exercicios.ex07.figura;

public class Circulo extends Figura {
    // atributos
    private Double raio;

    // construtor
    public Circulo (String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    // métodos
    @Override
    public Double calculaArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Figura", "Circulo");

        StringBuilder str = new StringBuilder(superStr);

        str.append(String.format("\nraio     : %.1f", this.raio));

        return String.valueOf(str);
    }

    // getter e setter
    public Double getRaio() {
        return raio;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
