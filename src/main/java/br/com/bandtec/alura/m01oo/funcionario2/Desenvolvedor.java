package br.com.bandtec.alura.m01oo.funcionario2;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }
    public Desenvolvedor(String nome, Integer salario) {
        super(nome, salario);
    }

    public Double getBonus() {
        return this.salario * 0.1;
    }

}
