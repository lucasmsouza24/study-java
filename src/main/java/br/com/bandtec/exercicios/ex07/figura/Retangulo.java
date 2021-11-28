package br.com.bandtec.exercicios.ex07.figura;

public class Retangulo extends Figura {
    // atributos
    private Double base;
    private Double altura;

    // construtor
    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        String superStr = super.toString().replaceAll("Figura", "Retangulo");

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
