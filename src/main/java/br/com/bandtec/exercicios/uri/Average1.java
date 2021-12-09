package br.com.bandtec.exercicios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        
        // Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the equal sign.

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double average = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        String str = "MEDIA = %.5f";
        str = String.format(Locale.US, str, average);
        System.out.println(str);

        sc.close();
    }
}
