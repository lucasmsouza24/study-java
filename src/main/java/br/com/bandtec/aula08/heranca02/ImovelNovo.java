package br.com.bandtec.aula08.heranca02;

public class ImovelNovo extends Imovel {

    public ImovelNovo(String endereco, Double preco) {
        super(endereco, preco);
    }

    @Override
    public Double getPrecoVenda() {
        return this.preco * 1.1;
    }
}
