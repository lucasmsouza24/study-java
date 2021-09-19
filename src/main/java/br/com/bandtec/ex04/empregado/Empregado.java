package br.com.bandtec.ex04.empregado;

public class Empregado {

    // attributes
    String nome, cargo;
    Double salario;

    // constructor
    Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    Empregado(String nome, String cargo, Integer salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = Double.valueOf(salario);
    }

    // reajustar salário baseado na porcentagem fornecida
    public void reajustarSalario(Double percent) {
        this.salario += (percent * this.salario) / 100;
    }

    public void reajustarSalario(Integer percent) {
        this.salario += (percent * this.salario) / 100;
    }

    // tostring override
    @Override
    public String toString() {
        String str = "-".repeat(30) +
        "\nnome: \"%s\"" +
        "\ncargo: \"%s\"" +
        "\nsalario: %.2f\n" +
        "-".repeat(30);
        return String.format(str, this.nome, this.cargo, this.salario);
    }
}