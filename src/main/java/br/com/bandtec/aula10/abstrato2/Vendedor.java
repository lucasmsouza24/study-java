package br.com.bandtec.aula10.abstrato2;

public class Vendedor extends Funcionario {

    // atributos
    private Double vendas;
    private Double taxa;

    /**
     * @param cpf
     * @param nome
     * @param vendas
     * @param taxa
     */
    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    @Override
    public Double calcSalario() {
        return this.vendas * this.taxa;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario", "Vendedor");
    }

    // getters setters
    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
}
