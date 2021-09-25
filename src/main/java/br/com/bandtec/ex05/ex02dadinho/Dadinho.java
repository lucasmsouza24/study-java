package br.com.bandtec.ex05.ex02dadinho;

import java.util.concurrent.ThreadLocalRandom;

public class Dadinho {
    
    // constructor
    public Dadinho() {
        this.rodar();
        this.vitorias = 0;
    }

    // atributos
    private Integer valor;
    private Integer vitorias;

    /**
     * gera novo valor para o dado
     */
    public void rodar() {
        this.valor = ThreadLocalRandom.current().nextInt(1, 7);
    }

    /**
     * incrementa 1 unidade à this.vitorias
     */
    public void vencer() {
        this.vitorias++;
    }

    /**
     * @return Integer de vitórias do dado
     */
    public Integer getVitorias() {
        return this.vitorias;
    }

    /**
     * @return Integer do valor sorteado pelo dado
     */
    public Integer getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValor());
    }
}
