package br.com.bandtec.alura.m01oo.funcionario3;

public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, Double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }

    private String senha;

    public Boolean senhaCorreta(String senha) {
        return senha.equals(this.senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getBonus() {
        return this.getSalario() * 0.15;
    }

}
