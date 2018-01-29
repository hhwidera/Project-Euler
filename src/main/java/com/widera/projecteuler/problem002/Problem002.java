package com.widera.projecteuler.problem002;

public class Problem002 {

    public static void main(String[] args) {
        System.out.println("sum: " + evenFibonacciNumberSum(90));
        System.out.println("sum: " + evenFibonacciNumberSum(4_000_000));
    }

    public static long evenFibonacciNumberSum(final long max) {
        long number1 = 1L;
        long number2 = 2L;

        long sumOfEvenNumbers = 2L;

        while (number1 + number2 < max) {
            long nextNumber = number1 + number2;
            if (nextNumber % 2 == 0) {
                sumOfEvenNumbers += nextNumber;
            }
            number1 = number2;
            number2 = nextNumber;
        }
        return sumOfEvenNumbers;
    }
}
