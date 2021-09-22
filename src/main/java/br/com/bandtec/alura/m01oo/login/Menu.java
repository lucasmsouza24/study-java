package br.com.bandtec.alura.m01oo.login;

import java.util.Scanner;

public class Menu {
    
    // Scanners
    Scanner scs = new Scanner(System.in);
    Scanner sci = new Scanner(System.in);
    Scanner scd = new Scanner(System.in);

    // string menu
    private String str = "\n[1] Login\n[2] Sign-up\n[3] Get out\n";
    
    public void showMenu(DB db) {
        
        // show menu string
        System.out.println(str);

        // input answer
        String answer = scs.nextLine();
        
        // treating answer
        switch(answer) {
            case "1":
                // login redirect
                System.out.println("login!");
                this.showMenu(db);
                break;
            case "2":
                // sign up redirect
                System.out.println("Sign-up");
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
}
