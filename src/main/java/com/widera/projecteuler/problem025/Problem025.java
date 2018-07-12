package com.widera.projecteuler.problem025;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem025 {

    public static void main(String[] args) {
        System.out.println("first term to contain three digits: " + firstTermContainsNumberOfDigits(3));
        System.out.println("first term to contain 1000 digits: " + firstTermContainsNumberOfDigits(1000));
    }

    private static int firstTermContainsNumberOfDigits(int digits) {
        AtomicInteger counter = new AtomicInteger(0);
        Triplet<Integer, BigInteger, Integer> firstTerm = FibonacciNumbers.asStream()
                .map(number -> new Triplet<>(counter.incrementAndGet(), number, digits(number)))
                .filter(triplet -> triplet.c >= digits)
                .findFirst().get();
        System.out.println("found " + firstTerm);
        return firstTerm.a;
    }

    private static int digits(final BigInteger number) {
        double factor = Math.log(2) / Math.log(10);
        int digitCount = (int) (factor * number.bitLength() + 1);
        if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
            return digitCount - 1;
        }
        return digitCount;
    }

}
