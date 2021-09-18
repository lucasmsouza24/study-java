package br.com.bandtec.ex04.encomendas;

public class Encomenda {

    // attributes
    Double altura;
    Double largura;
    Endereco enderecoRemetente;
    Endereco enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    // constructor
    Encomenda(Double altura, Double largura, Endereco enderecoRemetente, Endereco enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.altura = altura;
        this.largura = largura;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    // retorna true se encomenda for pequena
    private Boolean ePequeno() {
        return this.altura <= 6 && this.largura <= 16;
    }

    // retorna true se encomenda for média
    private Boolean eMedio() {
        return (7 <= this.altura && this.altura <= 15) && (16 <= this.largura && this.largura <= 50);
    }

    // retorna true se encomenda for grande
    private Boolean eGrande() {
        return this.altura >= 16 && this.largura >= 51;
    }

    // retorna parte do frete baseado no tamanho da encomenda
    private Double fatorTamanho() {
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

    // retorna parte do frete baseado na distância
    private Double fatorDistancia() {
        if (this.distancia <= 50) {
            return 3d;
        } else if (51 <= this.distancia && this.distancia <= 200) {
            return 5d;
        } else {
            return 7d;
        }
    }

    // retorna frete total
    public Double calcularFrete() {
        return this.fatorTamanho() + this.fatorDistancia();
    }

    // soma frete ao valor da encomenda
    public Double valorTotal() {
        return this.calcularFrete() + this.valorEncomenda;
    }

    public String emitirEtiqueta() {
        System.out.println("****** ETIQUETA PARA ENVIO ******");
        String str = "Endereço do remetente: %s\n" +
        "Endereço do destinatário: %s\n" +
        "Altura da encomenda: %.2f cm\n" +
        "Largura da encomenda: %.2f cm\n" +
        "----------------------\n" + 
        "Valor da encomenda: %d\n" +
        "Valor do frete: %d\n" +
        "----------------------\n" +
        "Valor total: R$ %.2f";
        str = String.format(
            str, 
            this.enderecoRemetente,
            this.enderecoDestinatario,
            this.altura,
            this.largura,
            this.valorEncomenda,
            this.calcularFrete(),
            this.valorTotal()
        );
        return str;
    }

    @Override
    public String toString() {
        String str = "altura: %.2f cm\nlargura: %.2f cm\nremetente: %s\ndestinatario: %s\ndistancia: %.2f km\nvalor: R$ %.2f\n";
        return String.format(str, this.altura, this.largura, this.enderecoRemetente, this.enderecoDestinatario, this.distancia, this.valorEncomenda);
    }
}
