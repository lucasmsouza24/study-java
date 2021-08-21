package br.com.bandtec.aula02;

public class Numericos {
    public static void main(String[] args) {
        Double numero = 3.4;
        Double numero2 = 3.6;
        
        System.out.println("Para cima: " + Math.ceil(numero));
        System.out.println("Para baixo: "+ Math.floor(numero));
        System.out.println("auto: " + Math.round(numero));
        System.out.println("auto: " + Math.round(numero2));
    }
}
