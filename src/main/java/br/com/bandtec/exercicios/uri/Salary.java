package br.com.bandtec.exercicios.uri;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        /*
        Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

        Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
        Don’t forget the space before and after the equal signal and after the U$.
        */

        Scanner sc = new Scanner(System.in);

        Integer employee = sc.nextInt();
        Integer hours = sc.nextInt();
        Double moneyPerHour = sc.nextDouble();

        sc.close();

        // calc
        Double salary = hours * moneyPerHour;

        // display
        String str = "NUMBER = %d\nSALARY = U$ %.2f";
        str = String.format(str, employee, salary);
        System.out.println(str);

    }
}
