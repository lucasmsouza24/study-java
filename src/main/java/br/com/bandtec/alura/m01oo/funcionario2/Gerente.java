package br.com.bandtec.alura.m01oo.funcionario2;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }
    public Gerente(String nome, Integer salario) {
        super(nome, salario);
    }

    public Double getBonus() {
        return this.salario * 0.15;
    }
}
