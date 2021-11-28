package br.com.bandtec.exercicios.ex07.figura;

public class Triangulo extends Figura {
    // atributos
    private Double base;
    private Double altura;

    // construtor
    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    // métodos
    @Override
    public Double calculaArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Figura", "Triangulo");

        StringBuilder str = new StringBuilder(superStr);

        str.append(String.format("\nbase     : %.1f", this.base));
        str.append(String.format("\naltura   : %.1f", this.altura));

        return String.valueOf(str);
    }

    // getters e setters
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
