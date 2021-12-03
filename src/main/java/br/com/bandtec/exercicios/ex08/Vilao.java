package br.com.bandtec.exercicios.ex08;

public class Vilao extends Personagem {
    
    
    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        return getForcaTotalBruta();
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("Personagem", "Vilão");
    }
}
