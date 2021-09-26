package br.com.bandtec.alura.m01oo.funcionario3;

public abstract class Funcionario {

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    private String nome;
    private Double salario;

    public abstract Double getBonus();

    // getters and setters

    // nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // salario
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }


    // toString
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }

}
