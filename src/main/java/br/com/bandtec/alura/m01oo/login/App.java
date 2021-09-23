package br.com.bandtec.alura.m01oo.login;

public class App {
    
    public static void main(String[] args) {
        
        Menu m = new Menu();
        DB db = new DB();

        m.showMenu(db);

    }
}
