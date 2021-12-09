package br.com.bandtec.exercicios.ex08;

public class App {
    public static void main(String[] args) {

        // heroi 1
        Heroi h1 = new Heroi("Spiderman", "Peter Parker");
        h1.adicionaPoder("Vai teia", 6);
        h1.adicionaPoder("escala parede", 4);

        System.out.println(h1);

        // heroi 2
        Heroi h2 = new Heroi("Thor", "Thor");
        h2.adicionaPoder("Voô", 7);
        h2.adicionaPoder("Trovao", 10);

        // vilao 1
        Vilao v1 = new Vilao("Coringa", "Arthur Fleck");
        v1.adicionaPoder("haha", 7);
        v1.adicionaPoder("tiro em rede nacional", 10);

        // lutas
        Confronto.lutar(h2, v1);
        Confronto.lutar(h1, v1);
    }
}
