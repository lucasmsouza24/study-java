package br.com.bandtec.ex04.encomendas;

public class App {
    
    public static void main(String[] args) {
        
        Encomenda encomenda1 = new Encomenda(
            1d,
            1d, 
            new Endereco("Rua A", "145A"), 
            new Endereco("Rua B", "200B"), 
            55d, 
            100d
        );

        System.out.println(encomenda1);

        System.out.println(encomenda1.calcularFrete());
    }
}
