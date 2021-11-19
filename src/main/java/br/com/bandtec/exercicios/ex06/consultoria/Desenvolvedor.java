package br.com.bandtec.exercicios.ex06.consultoria;

public class Desenvolvedor {
    // attributes
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHorasTrabalhadas;

    // constructors
    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHorasTrabalhadas) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    // methods
    public Double calcularSalario() {
        return this.qtdHorasTrabalhadas * this.valorHorasTrabalhadas;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("=".repeat(30));

        // title
        str.append("\nDesenvolvedor\n");

        // body
        str.append(String.format("\n%-20s %s", "Nome:", this.nome));
        str.append(String.format("\n%-20s R$ %.2f", "Salário:", calcularSalario()));
        str.append(String.format("\n%-20s %d hrs", "Tempo Trabalhado:", this.qtdHorasTrabalhadas));
        str.append(String.format("\n%-20s R$ %.2f", "val/hr:", this.valorHorasTrabalhadas));

        return String.valueOf(str);
    }

    // getters and setters 
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return this.qtdHorasTrabalhadas;
    }
    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getvalorHorasTrabalhadas() {
        return this.valorHorasTrabalhadas;
    }
    public void setvalorHorasTrabalhadas(Double valorHorasTrabalhadas) {
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }
}
