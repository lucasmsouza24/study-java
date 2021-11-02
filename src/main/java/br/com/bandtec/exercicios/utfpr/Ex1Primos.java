package br.com.bandtec.exercicios.utfpr;

public class Ex1Primos {
    
    public static Boolean isPrime(Integer value) {
        return value <= 0 ? false : positiveDivisorsDifferentOf1AndItself(value) == 0;
    }

    private static Integer positiveDivisorsDifferentOf1AndItself(Integer value) {
        Integer positiveDivisors = 0;

        for (int i = value - 1; i > 1; i--) {
            if (value % i == 0) {
                positiveDivisors++;
            }
        }

        return positiveDivisors;
    }

}
