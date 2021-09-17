package br.com.bandtec.ex04.encomendas;

public class Encomenda {
    Double altura;
    Double largura;
    Endereco enderecoRemetente;
    Endereco enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Encomenda(Double altura, Double largura, Endereco enderecoRemetente, Endereco enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.altura = altura;
        this.largura = largura;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    private Boolean ePequeno() {
        return this.altura <= 6 && this.largura <= 16;
    }

    private Boolean eMedio() {
        return (7 <= this.altura && this.altura <= 15) && (16 <= this.largura && this.largura <= 50);
    }

    private Boolean eGrande() {
        return this.altura >= 16 && this.largura >= 51;
    }

    // 100      this.val
    // %        frete
    public Double calcularFrete() {
        if (this.ePequeno()) {
            return this.valorEncomenda / 100;
        } else if (this.eMedio()) {
            return (this.valorEncomenda * 3) / 100;
        } else if (this.eGrande()) {
            return (this.valorEncomenda * 5) / 100;
        } else {
            return 0d;
        }
    }

    @Override
    public String toString() {
        String str = "altura: %.2f cm\nlargura: %.2f cm\nremetente: %s\ndestinatario: %s\ndistancia: %.2f km\nvalor: R$ %.2f\n";
        return String.format(str, this.altura, this.largura, this.enderecoRemetente, this.enderecoDestinatario, this.distancia, this.valorEncomenda);
    }
}
