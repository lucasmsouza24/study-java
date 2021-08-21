package br.com.bandtec.aula01;

// @author Lucas Mesquita
public class Exibicao {

    public static void main(String[] args) {
        /*
            Para exibição no console, utilizaremos:
            System.out.println()
         */

        System.out.println("Hello World");

        // convert String -> Integer
        Integer num = Integer.valueOf("103");
        System.out.println(num + 1);
        /*
            operadores aritméticos básicos:
                +
                -
                *
                /

            Incremento
                ++
                --
                +=
                -=
         */

        String nome = "Paulo";
        Integer idade = 57;
        Double credito = 200.0;
        System.out.println(
                "nome: " + nome
                + "\nidade: " + idade
                + "\ncredito: " + credito
        );

        System.out.println("\tisso é uma tabulação");
        
        
        Double passagens = credito / 4.4;
        System.out.println("Passagens disponíveis: " + passagens.intValue());

    }
}
