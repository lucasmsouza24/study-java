package br.com.bandtec.aula10.abstrato2;

public class Horista extends Funcionario {

    // atributos 
    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return this.valorHora * this.qtdHora;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario", "Horista");
    }

    // getter e setter
    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
}
