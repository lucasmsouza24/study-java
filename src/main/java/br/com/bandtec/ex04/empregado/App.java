package br.com.bandtec.ex04.empregado;

public class App {
    
    public static void main(String[] args) {
        
        Empregado e1 = new Empregado("Lucas Mesquita", "Desenvolvedor", 100d);
        e1.reajustarSalario(10);

        Empregado e2 = new Empregado("João", "Analista de Sistemas", 5400);
        e2.reajustarSalario(15);

        System.out.println(e1);
        System.out.println(e2);
    }

}
