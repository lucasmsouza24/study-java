package br.com.bandtec.ex05.ex01clube;

public class App {
    
    public static void main(String[] args) {
        
        Clube c1 = new Clube("Ponte Preta");
        Clube c2 = new Clube("Atlético Mineiro");

        c1.registrarDerrota();
        c1.registrarEmpate();

        c2.registrarVitoria();
        c2.registrarVitoria();
        c2.registrarEmpate();

        System.out.println(c1);
        System.out.println(c2);
    }
}
