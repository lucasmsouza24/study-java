package br.com.bandtec.alura.m01oo.funcionario3;

public class App {
    
    public static void main(String[] args) {
        
        // Funcionario f1 = new Funcionario("Carleto", 8000d);
        Desenvolvedor d1 = new Desenvolvedor("Luqinha", 3400d);
        Gerente g1 = new Gerente("Antenor", 3400d, "123");

        // System.out.println(f1.getBonus());
        System.out.println(d1.getBonus());
        System.out.println(g1.getBonus());

        System.out.println(Autenticar.autenticarFuncionario(g1, "123"));
    }

}
