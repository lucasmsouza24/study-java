package br.com.bandtec.aula10.abstrato2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    // atributo
    private List<Funcionario> funcionarios;

    // construtor
    public Empresa() {  
        this.funcionarios = new ArrayList<Funcionario>();
    }

    // métodos
    public void adicionaFunc(Funcionario f) {
        this.funcionarios.add(f);
    }

    public void exibeTodos() {
        for (Funcionario f : this.funcionarios) {
            System.out.println(f);
        }
    }

    public Double totalSalario() {
        Double total = 0d;

        for (Funcionario f : this.funcionarios) {
            total += f.calcSalario();
        }

        return total;
    }

    // getter
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
