package br.com.bandtec.alura.m01oo.login;

public class App {
    
    public static void main(String[] args) {
        
        Menu m = new Menu();
        Auth auth = new Auth();

        // m.showMenu(auth);

        Account acc1 = new Account("email@email.com", "asdfkasd");
        Account acc2 = new Account("email123@email.com", "asdfkdsfasdasd");
        Account acc3 = new Account("email231@email.com", "asdfkdasasd");

        auth.appendAcc(acc1);
        auth.appendAcc(acc2);
        auth.appendAcc(acc3);

        Boolean b = auth.accExists("email@email.com", "asdfkasd");

        System.out.println(b);
    }
}
