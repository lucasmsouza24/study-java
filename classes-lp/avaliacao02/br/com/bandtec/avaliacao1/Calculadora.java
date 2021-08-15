package br.com.bandtec.avaliacao1;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        primeiro número
        System.out.println("Digite um número: ");
        Double num1 = sc.nextDouble();
        
//        segundo número
        System.out.println("Digite outro número: ");
        Double num2 = sc.nextDouble();
        
//        soma dos números
        Double soma = num1 + num2;
        System.out.println("Resultado da soma: \n" + soma);
        
//        subtração dos números
        Double sub = num1 - num2;
        System.out.println("Resultado da subtração: \n" + sub);
        
//        multiplicação dos números
        Double mul = num1 * num2;
        System.out.println("Resultado da multiplicação: \n" + mul);
        
//        divisão dos números  
        Double div = num1 / num2;
        System.out.println("Resultado da divisão: \n" + div);

        sc.close();
    }
}
