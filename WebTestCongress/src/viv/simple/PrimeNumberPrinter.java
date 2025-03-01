package viv.simple;

import java.util.stream.IntStream;

public class PrimeNumberPrinter {

    public static void main(String[] args) {
        // Print prime numbers up to 100
        int limit = 100;
        System.out.print("Prime numbers: ");
        printPrimeNumbers(limit);
    }

    public static void printPrimeNumbers(int limit) {
        // Generate a stream of numbers from 2 to the given limit
        StringBuilder primes = new StringBuilder();
        
        // Generate primes and append to the StringBuilder
        IntStream.range(2, limit + 1)
                .filter(PrimeNumberPrinter::isPrime)  // Filter primes
                .forEach(p -> {
                    if (primes.length() > 0) {
                        primes.append(", ");  // Add comma for subsequent primes
                    }
                    primes.append(p);  // Append the prime number
                });
        
        // Print the result
        System.out.println(primes.toString());
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // A number is prime if it's greater than 1 and has no divisors other than 1 and itself
        return IntStream.range(2, (int) Math.sqrt(number) + 1)
                        .allMatch(i -> number % i != 0);
    }
}
