package br.com.bandtec.ex04.confeitaria;

public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida;

    // constructor
    Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        this.sabor = sabor;

        if (30 <= valor && valor <= 50) {
            this.valor = valor;
        } else {
            this.valor = 30d;
        }

        if (0 <= quantidadeVendida && quantidadeVendida <= 100) {
            this.quantidadeVendida = quantidadeVendida;
        } else {
            this.quantidadeVendida = 0;
        }
    }

    public void comprarBolo(Integer qtd) {
        if ((this.quantidadeVendida + qtd) > 100) {
            // recusando venda do bolo
            System.out.println("Seu pedido ultrapaçou nosso limite diário para esse bolo");
        } else {
            // vendendo bolo
            this.quantidadeVendida += qtd;
        }
    }

    public Double totalVendidoRS() {
        return this.quantidadeVendida * this.valor;
    }

    public void exibirRelatorio() {
        String str = "O bolo de %s foi vendido %d vezes hoje. Totalizando R$ %.2f";
        System.out.println(String.format(str, this.sabor, this.quantidadeVendida, this.totalVendidoRS()));
    }

    @Override
    public String toString() {
        String str = "Sabor %s\nValor: %.2f R$\nQtd. Vendida: %d\n";
        return String.format(str, this.sabor, this.valor, this.quantidadeVendida);
    }
}
