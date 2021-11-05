package br.com.bandtec.aula08.heranca03;

public class App {
    public static void main(String[] args) {
        VendedorComissao v1 = new VendedorComissao(1, "Lucas", 10000d, 50d);
        System.out.println(v1.calcularSalario());

        VendedorComissaoMaisFixo v2 = new VendedorComissaoMaisFixo(v1, 2000d);
        System.out.println(v2.calcularSalario());
    }
}
