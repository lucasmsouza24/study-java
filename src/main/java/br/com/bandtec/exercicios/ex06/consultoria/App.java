package br.com.bandtec.exercicios.ex06.consultoria;

public class App {
    
    public static void main(String args[]) {

        Desenvolvedor dev1 = new Desenvolvedor("Lucas", 100, 20d);
        Desenvolvedor dev2= new DesenvolvedorMobile("Diogo", 60, 20d, 40, 30d);

        System.out.println(dev1);
        System.out.println(dev2);
    }
}
