package br.com.bandtec.exercicios.uri;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        // Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

        // scanner instance
        Scanner sc = new Scanner(System.in);

        // inputs
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();

        double average = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        // displaying
        String str = "MEDIA = %.1f";
        str = String.format(str, average);
        System.out.println(str);

    }
}
