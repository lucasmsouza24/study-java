package br.com.bandtec.exercicios.uri;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        // Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

        // input
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        Integer D = sc.nextInt();

        sc.close();

        // calc
        Integer difference = (A * B) - (C * D);
        
        // displaying
        String str = "DIFERENCA = %d";
        str = String.format(str, difference);
        System.out.println(str);
    }
}
