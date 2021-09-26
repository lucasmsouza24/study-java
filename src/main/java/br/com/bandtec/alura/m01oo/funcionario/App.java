package br.com.bandtec.alura.m01oo.funcionario;

class Funcionario {
    private String nome;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return this.salario * 0.2;
    }
}

class Gerente extends Funcionario {

    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

}

class Desenvolvedor extends Funcionario {
    
    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

}

class TotalizadorDeBonus {

    private double total = 0;

    public void adicionaBonus(Funcionario f) {
        total += f.getBonus();
    }

    public double getTotal() {
        return this.total;
    }

}

public class App {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Gerente f2 = new Gerente();

        f1.setSalario(1000.0);
        f2.setSalario(1000.0);

        // System.out.println(f1.getBonus());
        // System.out.println(f2.getBonus());

        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adicionaBonus(f1);
        totalizador.adicionaBonus(f2);

        System.out.println(totalizador.getTotal());
    }
}
