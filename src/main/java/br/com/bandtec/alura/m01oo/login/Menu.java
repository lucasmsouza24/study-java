package br.com.bandtec.alura.m01oo.login;

import java.util.Scanner;

public class Menu {
    
    // Scanners
    Scanner scs = new Scanner(System.in);
    Scanner sci = new Scanner(System.in);
    Scanner scd = new Scanner(System.in);

    // string menu
    private String str = "\n[1] Login\n[2] Sign-up\n[3] Get out\n";
    private String strLogin = "\n[1] Sair\n";
    
    public void showMenu(DB db) {
        
        // show menu string
        System.out.println(str);

        // input answer
        String answer = scs.nextLine();
        
        // treating answer
        switch(answer) {
            case "1":
                // login redirect
                this.login(db);
                // this.showMenu(db);
                break;
            case "2":
                // sign up redirect
                this.signUp(db);
                this.showMenu(db);
                break;
            case "3":
                // get out
                System.out.println("Bye!");
                break;
            default:
                // invalid input
                System.out.println("Invalid Input! Try again.");
                this.showMenu(db);
                break;
        }
    }

    // login auth
    public void login(DB db) {
        // input user and password
        System.out.println("User: ");
        String user = scs.nextLine();

        System.out.println("Password: ");
        String pwd = scs.nextLine();

        if (db.userExists(user, pwd)) {
            System.out.println("\nSuccessfull login!\n");
            loginMenu(db);
        } else {
            System.out.println("\nError login! Try again.\n");
            this.showMenu(db);
        }
    }

    public void loginMenu(DB db) {
        System.out.println(this.strLogin);
        String answer = scs.nextLine();

        switch(answer) {
            case "1":
                System.out.println("Bye");
                this.showMenu(db);
                break;
            default:
                System.out.println("Invalid option.");
                this.loginMenu(db);
                break;
        }
    }

    public void signUp(DB db) {
        // input user and password
        System.out.println("User: ");
        String user = scs.nextLine();

        System.out.println("Password: ");
        String pwd = scs.nextLine();

        Account acc = new Account(user, pwd);

        db.appendAcc(acc);
        System.out.println("User signed-up!");

        this.showMenu(db);
    }
}
