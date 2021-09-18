package br.com.bandtec.ex04.confeitaria;

public class App {
    public static void main(String[] args) {

        Bolo bolo1 = new Bolo("maracuja", 34d, 5);
        Bolo bolo2 = new Bolo("chocolate", 46d, 2);
        Bolo bolo3 = new Bolo("morango", 50d, 0);

        bolo1.comprarBolo(38);
        bolo2.comprarBolo(40);
        bolo3.comprarBolo(35);

        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
    }
}
