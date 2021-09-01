package br.com.bandtec.ex03;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Integer age;

        do {
            System.out.println("Digite sua idade: (-1 para sair)");
            age = sc.nextInt();
            IdadeClass.classificaIdade(age);
        } while (age > 0);

        sc.close();

    }
}
