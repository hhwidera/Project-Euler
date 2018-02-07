package com.widera.projecteuler.problem010;

public class Problem010 {

    public static void main(String[] args) {
        System.out.println("Sum of all the primes below two million: " + PrimeNumber.parallelRangeClosed(2L, 2_000_000L).sum());
    }

}
