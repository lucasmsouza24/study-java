package br.com.bandtec.ex05.ex03lutarores;

public class Lutador {

    // construtor
    public Lutador(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public Lutador() {
        this.nome = "X";
        this.vida = 100;
    }
    
    // atributos
    private String nome;
    private Integer vida;

    /**
     * remove 10 de vida do Lutador
     * 
     */
    public void apanhar() {
        if (this.vida > 0 && ((this.vida - 10) >= 0)) {
            this.vida -= 10;
        } else if (this.vida > 0 && ((this.vida - 10) < 10)) {
            this.vida = 0;
        } 
    }

    /**
     * Aumenta a vida do lutador em 2
     */
    public void concentrarForca() {
        if ((this.vida + 2) <= 100 && this.vida != 0) {
            this.vida += 2;
        }
    }

    /**
     * reseta a vida máxima
     */
    public void reset() {
        this.vida = 100;
    }

    // getters 

    // get nome
    public String getNome() {
        return this.nome;
    }

    // get vida
    public Integer getVida() {
        return this.vida;
    }
}
