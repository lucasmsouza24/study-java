package br.com.bandtec.ex04.encomendas;

public class App {
    
    public static void main(String[] args) {
        
        Encomenda encomenda1 = new Encomenda(
            8d,
            17d, 
            new Endereco("Rua A", "145A"), 
            new Endereco("Rua B", "200B"), 
            4.3, 
            100d
        );

        System.out.println(encomenda1);

        System.out.println(encomenda1.calcularFrete());
    }
}
