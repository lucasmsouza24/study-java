package br.com.bandtec.exercicios.ex08;

public class Heroi extends Personagem {
    

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    public Double getForcaTotal() {
        return getForcaTotalBruta() * 1.15;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("Personagem", "Herói");
    }
}
