package br.com.bandtec.exercicios.ex04.rh;

public class Colaborador {

    // attributes
    String nome, cargo;
    Double salario;

    // constructor
    Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    Colaborador(String nome, String cargo, Integer salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = Double.valueOf(salario);
    }

    // to string override
    @Override
    public String toString() {
        String str = "-".repeat(30) + 
        "\nnome: %s" + 
        "\ncargo: %s" +
        "\nsalario: %.2f\n" +
        "-".repeat(30);
        return String.format(
            str,
            this.nome,
            this.cargo,
            this.salario
        );
    }

}
