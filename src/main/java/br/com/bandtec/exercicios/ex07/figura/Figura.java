package br.com.bandtec.exercicios.ex07.figura;

public abstract class Figura {
    
    // atributos
    private String cor;
    private Integer espessura;

    // construtor
    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    // métodos
    public abstract Double calculaArea();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nFigura\n");

        str.append("-".repeat(30));
        str.append(String.format("\ncor      : %s", this.cor));
        str.append(String.format("\nespessura: %d", this.espessura));
        str.append(String.format("\narea     : %.1f", this.calculaArea()));

        return String.valueOf(str);
    }

    // gettes e setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getEspessura() {
        return espessura;
    }
    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
