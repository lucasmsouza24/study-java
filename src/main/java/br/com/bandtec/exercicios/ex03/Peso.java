package br.com.bandtec.exercicios.ex03;

import java.util.Scanner;

public class Peso {
    
    public static void main(String[] args) {

        // scanner instance
        Scanner sc = new Scanner(System.in);
        Scanner str_sc = new Scanner(System.in);

        Integer usersQuantity;

        do {
            System.out.println("Quantos usuários serão lidos?");
            usersQuantity = sc.nextInt();
        } while (usersQuantity <= 0);

        for (Integer i = 1; i < usersQuantity + 1; i++) {
            System.out.println("-".repeat(30));
            String txt = "%d° pessoa";
            txt = String.format(txt, i);
            System.out.println(txt);

            String sexo;
            Double altura;

            do {
                System.out.println("Sexo: (M / F)");
                sexo = str_sc.nextLine();
            } while (!sexo.equals("m") && !sexo.equals("f"));

            do {
                System.out.println("Altura: (m)");
                altura = sc.nextDouble();
            } while (altura <= 0);

            Double pesoIdeal = PesoIdeal.calculaPesoIdeal(sexo, altura);

            txt = "\npeso ideal: %.1f kg";
            txt = String.format(txt, pesoIdeal);
            System.out.println(txt);
        }

        sc.close();
        str_sc.close();
    }

}
