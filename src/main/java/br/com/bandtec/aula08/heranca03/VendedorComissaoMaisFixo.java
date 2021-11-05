package br.com.bandtec.aula08.heranca03;

public class VendedorComissaoMaisFixo extends VendedorComissao {

    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFixo(VendedorComissao v, Double salarioFixo) {
        super(v.getCodigo(), v.getNome(), v.getVendas(), v.getTaxa());
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + salarioFixo;
    }
}
