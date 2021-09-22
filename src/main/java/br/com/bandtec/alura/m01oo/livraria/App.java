package br.com.bandtec.alura.m01oo.livraria;

// import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Prateleira p1 = new Prateleira();
        Menu menu = new Menu();

        menu.exibirMenu(p1);
    }
}
