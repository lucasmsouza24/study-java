package br.com.bandtec.aula08.heranca03;

public class App {
    public static void main(String[] args) {
        VendedorComissao v1 = new VendedorComissao(1, "Lucas", 10000d, 50d);
        System.out.println(v1.calcularSalario());

        VendedorComissaoMaisFixo v2 = new VendedorComissaoMaisFixo(2, "Joao", 10000d, 50d, 2000d);
        System.out.println(v2.calcularSalario());

        VendedorComissaoMaisFixo v3 = new VendedorComissaoMaisFixo(3, "Poul", 10000d, 20d, 2000d);
        System.out.println(v3.calcularSalario());

        Departamento d = new Departamento(v1);
        d.adicionaVendedor(v2);
        d.adicionaVendedor(v3);
        System.out.println(d.calularTotalSalario());
        d.exibeTodos();
    }
}
