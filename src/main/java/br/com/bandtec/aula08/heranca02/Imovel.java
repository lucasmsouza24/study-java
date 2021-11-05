package br.com.bandtec.aula08.heranca02;

public class Imovel {
    protected Double preco;
    private String endereco;

    // Constructor
    public Imovel(String endereco, Double preco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    // methods
    public Double getPrecoVenda() {
        return this.preco;
    }

    // getters and setters

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("%.1f", this.getPrecoVenda()).replaceAll(",", ".");
    }
}
