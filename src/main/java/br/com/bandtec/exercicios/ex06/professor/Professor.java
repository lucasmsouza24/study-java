package br.com.bandtec.exercicios.ex06.professor;

public class Professor {
    // attributes
    protected Integer codigo;
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    // constructor
    public Professor(Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    // methods
    public Double calcularSalario() {
        return this.qtdHoras * this.valorHora * 4.5;
    }

    @Override
    public String toString() {
        return String.format(
            "\nProfessor %d\n%s\nsalario: R$ %.2f\nhoras: %d\nval/hr: R$ %.2f", 
            codigo, 
            nome, 
            calcularSalario(),
            qtdHoras, 
            valorHora
        );
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
    public Integer getQtdHoras() {
        return qtdHoras;
    }
    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }    
}
