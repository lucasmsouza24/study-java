package br.com.bandtec.exercicios.ex05.ex07pokemon;

public class Pokemon {
    
    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = 0;
    }
    public Pokemon(String nome, String tipo, Integer forca) {
        this(nome, tipo, Double.valueOf(forca));
    }
    
    // atributos
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

    // nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // força
    public Double getForca() {
        return forca;
    }
    public void setForca(Double forca) {
        this.forca = forca;
    }
    public void setForca(Integer forca) {
        setForca(Double.valueOf(forca));
    }

    // doces
    public Integer getDoces() {
        return doces;
    }
    
    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    public void evoluir() {
        // 
    }

    @Override
    public String toString() {
        return String.format("\nPokemon\nNome: %s\nTipo: %s\nForca: %.1f\nDoces: %d", this.nome, this.tipo, this.forca, this.doces);
    }
}
