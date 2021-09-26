package br.com.bandtec.alura.m01oo.funcionario3;

public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public Double getBonus() {
        return this.getSalario() * 0.1;
    }

}
