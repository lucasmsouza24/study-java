package br.com.bandtec.exercicios.ex04.encomendas;

public class App {
    
    public static void main(String[] args) {
        
        Encomenda encomenda1 = new Encomenda(
            1d,
            1d, 
            new Endereco("Rua A", "145A"), 
            new Endereco("Rua B", "200B"), 
            55d, 
            10d
        );

        Encomenda encomenda2 = new Encomenda(
            10d,
            10d, 
            new Endereco("Rua C", "83A"), 
            new Endereco("Rua D", "1038B"), 
            194d, 
            30d
        );

        Encomenda encomenda3 = new Encomenda(
            34d,
            40d,
            new Endereco("Rua E", "43"),
            new Endereco("Rua F", "50B"),
            200d,
            20d
        );

        System.out.println(encomenda1.emitirEtiqueta());
        System.out.println(encomenda2.emitirEtiqueta());
        System.out.println(encomenda3.emitirEtiqueta());
    }
}
