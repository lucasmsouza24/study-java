package br.com.bandtec.ex05.ex05carro;

public class App {
    
    public static void main(String[] args) {

        Carro c1 = new Carro("Sedan");
        c1.ligar();
        c1.aumentarMarcha();
        c1.acelerar(7);
        c1.frear(2);
        System.out.println(c1);
        // System.out.println(c1.getVelocidade());
    }

}