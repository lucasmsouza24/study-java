package br.com.bandtec.alura.m01oo.funcionario2;

public class App {
    
    public static void main(String[] args) {
        
        Funcionario d = new Desenvolvedor("lucas", 1000d);
        Funcionario g = new Gerente("eduardo", 1000);
        System.out.println(d.getBonus());
        System.out.println(g.getBonus());
    }
}
