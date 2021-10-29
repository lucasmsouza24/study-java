package br.com.bandtec.aula06;

public class App2 {
    
    public static void main(String[] args) {
        
        Album a = new Album();

        a.addMusica(new Musica("alone again", 3.00));
        a.addMusica(new Musica("too late", 3.23));
        a.addMusica(new Musica("hardest", 4.02));

        System.out.println(a);
    }

}
