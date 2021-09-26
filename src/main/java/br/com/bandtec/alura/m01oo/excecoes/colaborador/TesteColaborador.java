package br.com.bandtec.alura.m01oo.excecoes.colaborador;

public class TesteColaborador {
    
    public static void main(String[] args) {

        // a)
        Colaborador c1 = new Colaborador("Lucas", "desenvolvedor junior", 3000);
        Colaborador c2 = new Colaborador("Josh", "enginer", 5500d);

        // b)
        RecursosHumanos rh = new RecursosHumanos();

        // c)
        System.out.println(c1);
        System.out.println(c2);

        try {
            // d)
            rh.promoverColaborador(c1, "desenvolvedor pleno", 4000);
            
            // e)
            rh.promoverColaborador(c2, "master enginer", 5000d);
        } catch (RuntimeException e) {
            System.out.println("-".repeat(30));
            System.out.println(e.getMessage());
        }

        // f)
        rh.reajustarSalario(c1, 4100d);

        // g)
        System.out.println(c1);
        System.out.println(c2);

        // h)
        System.out.println("total promovidos: " + rh.getTotalPromovidos());

        // i)
        System.out.println("total salarios reajustados: " + rh.getTotalSalariosReajustados());
    }

}
