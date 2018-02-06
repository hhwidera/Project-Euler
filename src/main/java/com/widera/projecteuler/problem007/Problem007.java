package com.widera.projecteuler.problem007;

import java.util.stream.LongStream;

public class Problem007 {

    public static void main(String[] args) {
        System.out.println("The 10 001st prime number: " +
            LongStream.iterate(2L, n -> n + 1L) // all numbers >= 2
                .filter(number -> LongStream.rangeClosed(2L, (long)Math.sqrt(number)).allMatch(j -> number % j != 0))
                .peek(System.out::println)
                .skip(10000L).findFirst().orElse(-1)
        );
    }

}
