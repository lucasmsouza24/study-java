package br.com.bandtec.aula08.heranca03;

public class VendedorComissao {
    // attributes
    protected Integer codigo;
    protected String nome;
    protected Double vendas;
    protected Double taxa;

    // constructor
    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    // methods
    public Double calcularSalario() {
        return vendas * (taxa / 100);
    }   

    // getters and setters
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
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

    @Override
    public String toString() {
        return "VendedorComissao [codigo=" + codigo + ", nome=" + nome + ", taxa=" + taxa + ", vendas=" + vendas + ", salarioTotal="+ calcularSalario() + "]";
    }
}
