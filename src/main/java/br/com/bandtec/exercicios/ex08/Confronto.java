package br.com.bandtec.exercicios.ex08;

public class Confronto {
    public static void lutar(Heroi heroi, Vilao vilao) {
        exibeLutadores(heroi, vilao);
        verificarVencedor(heroi, vilao);
    }

    public static void exibeLutadores(Heroi heroi, Vilao vilao) {
        System.out.println(String.format("%s vs %s", heroi.getCodinome(), vilao.getCodinome()));

        System.out.println(String.format("%6.1f %6.1f\n", heroi.getForcaTotal(), vilao.getForcaTotal()));
    }

    public static void verificarVencedor(Heroi heroi, Vilao vilao) {
        if (heroi.getForcaTotal() == vilao.getForcaTotal()) {
            System.out.println("Empate");
        } else if (heroi.getForcaTotal() > vilao.getForcaTotal()) {
            System.out.println(heroi.getCodinome() + " venceu!\n");
        } else {
            System.out.println(vilao.getCodinome() + " venceu!\n");
        }
    }
}
