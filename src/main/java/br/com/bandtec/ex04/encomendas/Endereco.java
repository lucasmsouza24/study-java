package br.com.bandtec.ex04.encomendas;

public class Endereco {
    String rua;
    String numero;

    Endereco(String rua, String numero) {
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        String str = "%s, %s";
        return String.format(str, this.rua, numero);
    }
}
