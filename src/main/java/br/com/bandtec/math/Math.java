package br.com.bandtec.math;

public class Math {
    
    public static Integer factorial(Integer value) {

        // returns factorial of value
        for (Integer i = value - 1; i > 0; i--) {
            value *= i;
        }

        return value;
    }

    public static Integer positiveDivisors(Integer value) {
        // return amount of divisors of value

        Integer divisors = 0;

        for (int i = value; i > 0; i--) {
            if (value % i == 0) {
                divisors++;
            }
        }

        return divisors;
    }

    public static Boolean isPrime(Integer value) {
        // return true if value is prime

        return positiveDivisors(value) == 2 || value == 1;
    }

    public static Integer[] primes(Integer amount) {
        // return a prime array who the length is amount

        Integer[] primes = new Integer[amount];
        
        Integer index = 0;

        for (int i = 0; index < amount; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }
        }

        return primes;
    }

}