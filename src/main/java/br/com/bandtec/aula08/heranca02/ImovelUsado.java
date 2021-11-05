package br.com.bandtec.aula08.heranca02;

public class ImovelUsado extends Imovel {
    
    // constructor
    public ImovelUsado(String endereco, Double preco) {
        super(endereco, preco);
    }

    @Override
    public Double getPrecoVenda() {
        return this.preco * 0.9;
    }
}
