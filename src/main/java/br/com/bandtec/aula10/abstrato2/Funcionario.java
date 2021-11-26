package br.com.bandtec.aula10.abstrato2;

public abstract class Funcionario {
    
    // atributos
    protected String cpf;
    protected String nome;

    // construtor
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // métodos
    public abstract Double calcSalario();

    // getters e setters
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", salario: " + calcSalario() + "]";
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
