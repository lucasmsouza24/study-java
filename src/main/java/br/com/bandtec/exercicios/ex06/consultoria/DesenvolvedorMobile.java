package br.com.bandtec.exercicios.ex06.consultoria;

public class DesenvolvedorMobile extends Desenvolvedor {
    // attributes
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    // constructor
    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada, Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhadasMobile) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    // methods
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + this.valorHorasTrabalhadasMobile * this.qtdHorasTrabalhadasMobile;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());

        str.append(String.format("\n%-20s: %d hrs", "Tempo trabalhado (mobile)", this.qtdHorasTrabalhadasMobile));
        str.append(String.format("\n%-20s: R$ %.2f", "val/hr (mobile)", this.valorHorasTrabalhadasMobile));

        return String.valueOf(str);
    }

    // getters and setters
    public Integer getqtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }
    public void setqtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhadasMobile() {
        return valorHorasTrabalhadasMobile;
    }
    public void setValorHorasTrabalhadasMobile(Double valorHorasTrabalhadasMobile) {
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }
}
