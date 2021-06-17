import java.util.Arrays;

public class myApp {
    public static void main(String[] args) {
        printArray(primeNumBetween(1, 100));
    }

    // print txt
    public static void print(float value) {
        System.out.println("value: " + value);
    }

    // return a array which contains every integer number between 'start' and 'end'
    public static int[] range(int start, int end) {
        int[] range = {};
        
        for (int i = start; i <= end; i++) {
            range = Arrays.copyOf(range, range.length + 1);
            range[range.length - 1] = i;
        }
        return range;
    }

    // return a array which contains every even numbers between 'start' and 'end'
    public static int[] evenNumbers(int start, int end) {
        int[] interval = range(start, end);
        int[] evenNumbers = {};

        for (int i : interval) {
            // append 'i' to evenNumber if it is a even number
            if (i % 2 == 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = i;
            }
        }
        return evenNumbers;
    }

    // return a array which contains every even numbers between 'start' and 'end'
    public static int[] oddNumbers(int start, int end) {
        int[] interval = range(start, end);
        int[] evenNumbers = {};

        for (int i : interval) {
            // append 'i' to evenNumber if it is a odd number
            if (i % 2 != 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = i;
            }
        }
        return evenNumbers;
    }

    // return a array which contains every prime number between 'start' and 'end'
    public static int[] primeNumBetween(int start, int end) {
        int[] interval = range(start, end);
        int[] primeNums = {};

        for (int i : interval) {
            if (isPrime(i)) {
                primeNums = Arrays.copyOf(primeNums, primeNums.length + 1);
                primeNums[primeNums.length - 1] = i;
            }
        }

        return primeNums;
    }

    public static boolean isPrime(int number) {
        int[] interval = range(1, number);
        int divisors = 0;
        for (int i : interval) {
            if (number % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2) {
            return true;
        } else {
            return false;
        }
    }

    // print a array on console
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("i: " + array[i]);
        }
    }
}