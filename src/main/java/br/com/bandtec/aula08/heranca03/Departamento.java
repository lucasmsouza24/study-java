package br.com.bandtec.aula08.heranca03;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<VendedorComissao> vendedores;

    Departamento(VendedorComissao v) {
        vendedores = new ArrayList<>();
        vendedores.add(v);
    }

    public void adicionaVendedor(VendedorComissao v) {
        this.vendedores.add(v);
    }

    public Double calularTotalSalario() {
        Double total = 0d;
        for (VendedorComissao v : this.vendedores) {
            total += v.calcularSalario();
        }
        return total;
    }

    public void exibeTodos() {
        for (VendedorComissao v : this.vendedores) {
            System.out.println(v);
        }
    }
}
