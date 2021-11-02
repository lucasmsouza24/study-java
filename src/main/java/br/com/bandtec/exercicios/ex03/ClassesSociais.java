package br.com.bandtec.exercicios.ex03;

import java.util.Scanner;

public class ClassesSociais {
    
    public static void main(String[] args) {

        // import class
        ClassesSociaisClass csc = new ClassesSociaisClass();
        
        // scanner instance
        Scanner sc = new Scanner(System.in);
        
        Double salary;
        
        // input salary
        do {
            System.out.println("Digite sua renda: ");
            salary = sc.nextDouble();
        } while(salary < 0);

        // close scanner instance
        sc.close();
        // get min salarys
        Double minSalary = ClassesSociaisClass.minSalarys(salary);

        // get social class
        String socialClass = csc.socialClass(minSalary);

        String txt = "Você recebe aproximadamente %.1f salários minimo.\n"+
        "Você pertence à classe social: %s";
        txt = String.format(txt, minSalary, socialClass);
        System.out.println(txt);
    }
}
