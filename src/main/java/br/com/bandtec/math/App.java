package br.com.bandtec.math;

public class App {
    
    public static void main(String[] args) {
        
        // System.out.println(Math.positiveDivisors(-2));
        // System.out.println(Math.isPrime(9));

        for (Integer i : Math.primes(10)) {
            System.out.println(i);
        }
    }
}