package br.com.bandtec.exercicios.uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
        Scanner sc = new Scanner(System.in);
        
        Double A = Double.valueOf(Math.round((sc.nextDouble() * 100) / 100));
        Double B = Double.valueOf(Math.round((sc.nextDouble() * 100) / 100));
        
        Double MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
        
        System.out.println("MEDIA = " + MEDIA);
        
        sc.close();
    }
 
}