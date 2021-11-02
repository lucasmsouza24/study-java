package br.com.bandtec.exercicios.ex04.termometro;

public class App {

    public static void main(String[] args) {

        Termometro t1 = new Termometro(10);
        t1.increaseTemperature(3d);
        System.out.println(t1);

        Termometro t2 = new Termometro(10);
        t2.increaseTemperature(10);
        t2.decreaseTemperature(20);
        System.out.println(t2);
    }

}