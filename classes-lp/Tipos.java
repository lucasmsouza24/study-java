package br.com.bandtec.mavenproject1.nivelamento;

// @author Lucas Mesquita
public class Tipos {
    // Torna a classe executável
    // Indicação do ponto de partida
    public static void main(String[] args) {
        /*
        tipos primitivos:
            int
            double
            boolean
        
            não aceitam "null"
        
        Classes Wrapper:
            Integer
            Double
            Boolean

            Aceitam "null" e possuem métodos uteis de conversão
        */
        
        
        // String: tipo para texto
        String nome = "Diego";
        String faculdade = "Bandtec";
        String professorAssistente = "Paulo";
        
        // Inteiro: representa números inteiros
        Integer idadeDiego = 28;
        Integer idadePaulo = 45;
        
        // Double: tipo para números com casas decimais
        Double valor = 10.50;
        Double altura = 1.83;
        
        // Boolean: para representar veidadeiro ou falso
        Boolean ligado = true;
        Boolean temMundial = false;
        Boolean eMaior = idadeDiego > 30;
        Boolean eIgual = idadeDiego == 30;
        
    }
}
