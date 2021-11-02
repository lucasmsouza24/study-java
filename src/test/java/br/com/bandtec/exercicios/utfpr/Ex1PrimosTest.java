package br.com.bandtec.exercicios.utfpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex1PrimosTest {
    @Test
    public void testIsPrime() {
        System.out.println(Ex1Primos.isPrime(2));
        assertTrue(Ex1Primos.isPrime(1));
        assertTrue(Ex1Primos.isPrime(2));
        assertTrue(Ex1Primos.isPrime(3));
        assertTrue(Ex1Primos.isPrime(5));
        assertTrue(Ex1Primos.isPrime(7));
    }

    @Test
    public void testIsPrimeReturnFalseWhen10Passed() {
        assertFalse(Ex1Primos.isPrime(10));
    }

    @Test
    public void testIsPrimeReturnFalseWhen4Passed() {
        assertFalse(Ex1Primos.isPrime(4));
    }

    @Test
    public void testIsPrimeReturnFalseWhen0Passed() {
        assertFalse(Ex1Primos.isPrime(0));
    }

    @Test
    public void testIsPrimeReturnTrueWhen1Passed() {
        assertTrue(Ex1Primos.isPrime(1));
    }

    @Test
    public void testIsPrimeReturnTrueWhen3Passed() {
        assertTrue(Ex1Primos.isPrime(3));
    }

    @Test
    public void testIsPrimeReturnTrueWhen5Passed() {
        assertTrue(Ex1Primos.isPrime(5));
    }

    @Test
    public void testIsPrimeReturnTrueWhen7Passed() {
        assertTrue(Ex1Primos.isPrime(7));
    }

    @Test
    public void testIsPrimeReturnFalseWhenNegativeValuePassed() {
        assertFalse(Ex1Primos.isPrime(-7));
        assertFalse(Ex1Primos.isPrime(-10));
        assertFalse(Ex1Primos.isPrime(-3));
        assertFalse(Ex1Primos.isPrime(-2));
        assertFalse(Ex1Primos.isPrime(-1));
    }
}
