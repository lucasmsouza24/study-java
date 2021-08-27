package br.com.bandtec.aula03metodos;

public class Utilitaria {
    
    void exibeLinha() {
        System.out.println("-".repeat(30));
    }

    void exibeNome() {
        System.out.println("Pedrolas");
    }

    void exibeNomeDecorado() {
        exibeLinha();
        exibeNome();
        exibeLinha();
    }
    
}
