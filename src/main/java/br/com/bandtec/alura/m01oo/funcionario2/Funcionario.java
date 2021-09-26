package br.com.bandtec.alura.m01oo.funcionario2;

/**
 * Classes abstratas não podem ser instanciadas
 * Ao envés disso, elas devem ser extendidas
 */
public abstract class Funcionario {
    
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(String nome, Integer salario) {
        this(nome, Double.valueOf(salario));
    }

    String nome;
    Double salario;

    /**
     * Métodos abstratos não precisam de corpo,
     * pois seu corpo deve ser declarado obrigatóriamente
     * em suas classes filhas (ou extenções)
     */
    abstract Double getBonus();

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
    public void setSalario(Integer salario) {
        setSalario(Double.valueOf(salario));
    }
    
}
