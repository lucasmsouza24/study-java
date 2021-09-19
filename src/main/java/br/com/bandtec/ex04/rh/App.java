package br.com.bandtec.ex04.rh;

public class App {
    
    public static void main(String[] args) {

        RecursosHumanos rh = new RecursosHumanos();

        Colaborador c1 = new Colaborador("Lucas", "Desenvolvedor", 2800d);
        Colaborador c2 = new Colaborador("Cleude", "Contadora", 3000d);
        Colaborador c3 = new Colaborador("Marcio", "Metalurgico", 4000d);

        // antes
        System.out.println("=".repeat(13) + "Antes" + "=".repeat(13));
        System.out.println(c1 + "\n" + c2 + "\n" + c3);

        // operações
        rh.promoverColaborador(c1, "Analista", 3000d);
        rh.promoverColaborador(c2, "Gerente de Contabilidade", 2800d);
        rh.reajustarSalario(c3, 4100d);

        // depois
        System.out.println("=".repeat(13) + "Depois" + "=".repeat(13));
        System.out.println(c1 + "\n" + c2 + "\n" + c3);

        System.out.println(rh);

    }
}
